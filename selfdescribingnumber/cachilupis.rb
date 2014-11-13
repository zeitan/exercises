#is the implementation fo self_describe number
#http://en.wikipedia.org/wiki/Self-descriptive_number

MAX_NUMBER = 3_300_000

def number?(value)
  true if Float(value) rescue false
end

def cachilupi?(a)
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

def crear_cachilupis
  cachilupis=[]
  MAX_NUMBER.times { |i| cachilupis << i.to_s if cachilupi?(i.to_s) }
  cachilupis
end

contents= File.open('cachilupis', 'r') { |f| f.read }

contents.split(/\r?\n|\r/).each  do |value|

  if value=="lista"
    crear_cachilupis.each{ |value| puts "#{value}:si" }
  else
    puts "#{value}:" + ((cachilupi?(value)) ? "si" : "no" )
  end

end



