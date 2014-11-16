def palindrome(number)
  number.to_s ==number.to_s.reverse
end

def product(x)
  (x..999).map { |y|  { x:x, y:y, result:x*y } if palindrome(x*y) }.flatten.compact
end

p (100..999).map {  |x|  product(x) }.flatten.max{ |a,b| a[:result] <=> b[:result] }

