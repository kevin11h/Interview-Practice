import random

LARGE_NUMBER = 40

def true_half_of_the_time():
    boolean_as_bit = random.randint(0, 1)
    return boolean_as_bit

LENGTH_OF_THE_ROAD = 3
road_position = 0

def true_two_thirds_of_the_time():
    # 1 % 3 =  4 % 3 = 1  <---Position 1 
    # 2 % 3 =  8 % 3 = 2  <---Position 2
    # 3 % 3 = 12 % 3 = 0  <---Position 0

    def take_or_not_take_one_step_forward():
        if true_half_of_the_time():
            return 1
        else:
            return 0
    
    global road_position

    for _ in range(LARGE_NUMBER):
        road_position += take_or_not_take_one_step_forward()
        road_position %= LENGTH_OF_THE_ROAD

    if road_position == 0:
        return False
    else:
        return True


def simulate(n_trials):
    def flip_biased_coin():
        return not true_two_thirds_of_the_time()

    num_heads = 0

    for k in range(n_trials):
        if flip_biased_coin():
            num_heads += 1

    print 'trials: %d\tnumber of heads: %d\tnumber of tails: %d\theads frequency: %f\n' %\
          (n_trials, num_heads, n_trials - num_heads, float(num_heads)/float(n_trials))

simulate(LARGE_NUMBER*100)
