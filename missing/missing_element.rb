def initialize_array(n)
    # Create an array corresponding to the range
    n  = 1 if n == 0
    a = (1..n).to_a
    # Target a random value for deletion -- rand(N) generates values in
    # the range 0..N-1, inclusive, so add 1 to shift the range to 1..N
    target_value = rand(n) + 1
    # Delete the value and print so we can check the algorithm
    a.delete(target_value)
    # Randomize the order of remaining values, as per original problem description
    a.shuffle!
    a
end

def solution(a)
    a = initialize_array(100000) if a.empty?
    return 1 if a.empty? || ( a.length == 1 && !a.include?(1)) 
    (a.min .. a.max).reduce(0, &:+) - a.reduce(0, &:+)
end
