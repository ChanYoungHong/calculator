from math import gcd, sqrt
from random import randint


def monte_carlo( n_trials, binary_sampler ):  # num_trials -> 숫자의 개수, 서로소인 바이너리 개수
    return sum([dirichlet_test()]*4)/n_trials              
                                        
def dirichlet_test():
    return gcd( randint(1, 1000), randint(1, 1000)) == 1 # 1 ~ 1000 사이에 난수 돌려서 최소 공배수 리턴
    # 서로소를 구할 때 쓰는 명령어다
    
def quess_pi( n_trials ):
    return sqrt( 6 / monte_carlo( n_trials, dirichlet_test)) 
    # sqrt 제곱근을 반환 함

print( quess_pi( 100_000 ))
