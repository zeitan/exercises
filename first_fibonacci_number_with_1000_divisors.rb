require 'benchmark'

def key_number
  iteration = 1
  fibonacci  = [1,1]
  begin
    if iteration > 2
      num = fibonacci[fibonacci.length-2]
      fibonacci[fibonacci.length-2] = fibonacci.last
      fibonacci[fibonacci.length-1] = fibonacci.last + num
    end
    iteration += 1
  end until divisors_of(fibonacci.last) > 1000
  fibonacci.last
end

def divisors_of(num)
  primes = {
        2 : 0, 3 : 0, 5 : 0, 7 : 0, 11 : 0, 13 : 0, 17 : 0,
        19 : 0 , 23 : 0, 29 : 0, 31 : 0, 37 : 0, 41 :0, 43 : 0,
        47 : 0, 53 : 0, 59 : 0, 61 : 0, 67 : 0, 71 : 0, 73 : 0, 79 :0,
        83 : 0, 89 : 0, 97 : 0, 101 : 0, 103 : 0, 107 : 0, 109 : 0, 113 : 0,
        127: 0, 131 : 0, 137 : 0, 139 : 0, 149 : 0, 151 : 0, 157 : 0, 163 : 0, 167 : 0, 173 : 0
      }

  num_reduced = num

  #factorization of the number
  primes.keys.each do |prime_divisor|
    while num_reduced % prime_divisor == 0
      primes[prime_divisor] += 1
      num_reduced /= prime_divisor
    end
    break if num_reduced == 0
  end

  amount_divisors_number(primes, num)
end

def amount_divisors_number(factorization_number, num)
  divisors = 1
  factor_collection =  factorization_number.select{|k,v| v != 0 }
  unless factor_collection.empty?
    divisors = factor_collection.map{|k,v| v + 1}.inject(:*)
    divisors +=1 if divisors == 2
  else
    divisors = 2 if  num > 1
  end

  divisors
end

#p divisors_of(5358359254990966640871840)
iterations = 1_000

Benchmark.bm do |bm|
#p  Benchmark.measure { key_number }
  bm.report do
    iterations.times do
      key_number
    end
  end
end
