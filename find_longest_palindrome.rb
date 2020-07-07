input = "afoolishconsistencyisthehobgoblinoflittlemindsadoredbylittlestatesmenandphilosopher" <<
            "sanddivineswithconsistencyagreatsoulhassimplynothingtodohemayaswellconcernhimselfwi" <<
          "thhisshadowonthewallspeakwhatyouthinknowinhardwordsandtomorrowspeakwhattomorrowthin" <<
          "ksinhardwordsagainthoughitcontradicteverythingyousaidtodayahsoyoushallbesuretobemis" <<
          "understoodisitsobadthentobemisunderstoodpythagoraswasmisunderstoodandsocratesandjes" <<
          "usandlutherandcopernicusandgalileoandnewtonandeverypureandwisespiritthatevertookfle" <<
          "shtobegreatistobemisunderstood"

index = 0
max_palindrome_length = 2
palindrome = ""

# TODO
#  check slice from the beginning... not good, give another look

begin

  slice = input[index..(index + max_palindrome_length - 1)]
  if slice == slice.reverse
    palindrome = slice
    max_palindrome_length = palindrome.length + 1
  end

  if index +  palindrome.length + 1 <  input.length
    index += 1
  else
    index = input.length + 1
  end

end until index > input.length

p palindrome
