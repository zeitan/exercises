def build_regexp(test_case)
  position_matches = []
  output = ""
  test_case.scan(/\(|\)/) { position_matches << $~.offset(0)[0] }
  position_matches.each_slice(2).to_a.each do |positions|
    tmp_output = test_case[positions[0]+1..positions[1]-1].gsub('','|')
    output += "(#{tmp_output[1..tmp_output.length-2]})"
  end
  return output unless output == ""
  test_case
end

#Read File
contents= File.open('alien', 'r') { |f| f.read }
inputs=contents.split(/\r?\n|\r/)

#Load input config
iterate=inputs[0].split(" ")

end_known_language = iterate[1].to_i
know_language =[]
for i in 1..end_known_language
  know_language << inputs[i]
end

for  case_to_check in 1..4
  test_case = inputs[end_known_language+case_to_check].gsub(" ","")
  puts "Case #{case_to_check}:#{know_language.join("\n").scan(/^#{build_regexp(test_case)}/).size}"
end
