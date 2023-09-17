def get_max_score(*args):
    return max(args)

korean, english, mathematice, science = 100, 86, 81, 91

max_score = get_max_score(korean, english, mathematice, science)
print('높은 점수: ', max_score)

max_score = get_max_score(english, science)
print('높은 점수: ', max_score)



korean, english, mathematice, science = map(int, input().split())

def get_min_max_score(*args):
    return min(args), max(args)

def average_score(**kwargs):
    return (sum(kwargs.values())/len(kwargs))

min_score, max_score = get_min_max_score(korean, english, mathematice, science)
average = average_score(korean=korean, english=english, mathematice=mathematice, science=science)
print('낮은 점수 {0:.2f}, 높은 점수 {1:.2f}, 평균 점수 {2:.2f}'.format(min_score, max_score, average))

min_score, max_score = get_min_max_score(english, science)
average = average_score(english=english, science=science)
print('낮은 점수 {0:.2f}, 높은 점수 {1:.2f}, 평균 점수 {2:.2f}'.format(min_score, max_score, average))
