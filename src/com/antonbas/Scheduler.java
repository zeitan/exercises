package com.antonbas;


import java.util.List;

public class Scheduler {
    Planification[] planifications;
    int numberOfCpus;

    public Scheduler(int numberOfCpus) {
        this.numberOfCpus = numberOfCpus;
        this.planifications = new Planification[numberOfCpus];
    }

    private int isSchedulable(Planification planificationToScehdule) {
        for(int i = 0; i < numberOfCpus; i++)
        {
            Planification planification = planifications[i];
            if (planification == null)
                return i;
            while(planification !=  null) {
                Planification freeSlot = planification.getFreeSlot();
                if (freeSlot.getStartTime() <= planificationToScehdule.getStartTime() &&  planificationToScehdule.getEndTime() <= freeSlot.getEndTime())
                    return i;
                planification = planification.getNext();
            }
        }

        return -1;
    }

    public Planification addPlanification(long starTime, int duration) {
        Planification planification = new Planification(starTime, duration);
        int cpuAvailable = isSchedulable(planification);
        if (cpuAvailable != -1) {
            Planification planificationQueue = planifications[cpuAvailable];
            if (planificationQueue == null) {
                planifications[cpuAvailable] = planification;
                return planification;
            }

            while(planificationQueue !=  null) {
                Planification freeSlot = planification.getFreeSlot();
                if (freeSlot.getStartTime() <= planification.getStartTime() &&  planification.getEndTime() <= freeSlot.getEndTime()) {
                    planification.next = planificationQueue.next;
                    planificationQueue.next = planification;
                    return planification;
                }
                planificationQueue = planificationQueue.getNext();
            }
        }
        return null;
    }

    public List<Planification> schedulePlanification(List<Planification> planfications) {
        return null;
    }

    static class Planification {
        private final long startTime;
        private final long duration;
        private Planification next;

        public Planification(final long startTime, final long duration) {
            this.startTime = startTime;
            this.duration = duration;
            next = null;
        }

        public long getStartTime() {
            return startTime;
        }

        public long getDuration() {
            return duration;
        }

        public long getEndTime() {
            return startTime + duration;
        }

        public Planification getNext() {
            return next;
        }

        public void setNext(Planification next) {
            this.next = next;
        }

        public Planification getFreeSlot() {
            long endTime = getEndTime();
            return new Planification(endTime, (next!= null) ? next.startTime - endTime : Long.MAX_VALUE - endTime);
        }
    }
}
