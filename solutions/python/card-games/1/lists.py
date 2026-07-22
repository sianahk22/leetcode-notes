"""Functions for tracking poker hands and assorted card tasks.

Python list documentation: https://docs.python.org/3/tutorial/datastructures.html
"""


def get_rounds(number):
   return [number,number+1,number+2]


def concatenate_rounds(rounds_1, rounds_2):
    return rounds_1 + rounds_2


def list_contains_round(rounds, number):
   return number in rounds
        


def card_average(hand):
       return sum(hand)/len(hand)


def approx_average_is_average(hand):
    return  card_average(hand) == ((hand[0] + hand[-1])/2)  or card_average(hand) == hand[len(hand)//2]
  

def average_even_is_average_odd(hand):
    pairs = hand[::2]
    impairs = hand[1::2]
    return sum(pairs)/len(pairs) == sum(impairs)/len(impairs)
  



def maybe_double_last(hand):
       if hand[-1] == 11:
           hand[-1] = hand[-1]*2
       return hand      
           
       
