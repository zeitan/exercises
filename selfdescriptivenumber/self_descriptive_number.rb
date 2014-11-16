#is the implementation fo self_describe number
#http://en.wikipedia.org/wiki/Self-descriptive_number

MAX_NUMBER = 3_300_000

def number?(value)
  true if Float(value) rescue false
end

def self_descriptive_number?(a)
  return false unless number?(a)
  resultfinal = ""

  digits = a.to_s.chars.collect {|digit| digit.to_i}
  digits.each_with_index do |x,y|
    if ( digits.select{ |element| element.to_i==y}.size == x )
      resultfinal << x.to_i.to_s
    else
      break
    end
  end

  (a == resultfinal) ? true : false
end

def build_self_descriptive_number
  MAX_NUMBER.times.map { |i|  i.to_s if self_descriptive_number?(i.to_s) }.compact
end

contents= File.open('self_descriptive_number', 'r') { |f| f.read }

contents.split(/\r?\n|\r/).each  do |value|

  if value=="lista"
    build_self_descriptive_number.each{ |value| puts "#{value}:si" }
  else
    puts "#{value}:" + ((self_descriptive_number?(value)) ? "si" : "no" )
  end

end



