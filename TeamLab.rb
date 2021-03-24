def divisor(num)
  result = []
  i = 1
  while i <= 20000000 do
    remainder = num % i
    if remainder == 0
      result << i
    end
    i += 1
  end
  return result
end

puts "約数を算出したい整数を入力してください"
num = gets.to_i
r = divisor(num)
puts r
puts "約数の数は#{r.length}です"
puts "約数の合計は#{r.sum}です"

puts "求めたい数字を入力して下さい"
puts "１つ目の数字"
a = gets.to_i
puts "２つ目の数字"
b = gets.to_i
puts "３つ目の数字"
c = gets.to_i
puts "何番目の数字を求めますか？"
t = gets.to_i

n = 0
while n < (t - 3)
  d = a + b + c
  a = b
  b = c
  c = d
  n += 1
end

puts "#{t}番目の数は#{c}です"

def findthird
  num = 1
  r = 0
  while (num <= 30000) do
    if (num % 3 == 0 || num.to_s.include?("3"))
    r =   r + num
    end
    num = num + 1
  end
  puts r
end

puts findthird
