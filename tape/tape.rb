def solution(a)
    return -1 if a.length == 0

    m = a.length-1    
    return a.first if m == 0
    
    left_acum = 0
    right_acum = a[0..m].inject(&:+)
    parts = []
    (1..m).each do |p|        
        left  = a[p-1] + left_acum
        right = right_acum - left
        parts << (left-right).abs
        left_acum = left
    end
    parts.sort.first 
end
