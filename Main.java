def cumulative_sum(*args):
    total_sum = 0
    cumulative_sums = []
    cumulative_sum = 0
    
    for arg in args:
        total_sum += arg
        cumulative_sum += arg
        cumulative_sums.append(cumulative_sum)
    
    return total_sum, cumulative_sums

# Example usage:
parameters = (4, 5, 10)
total, cum_sums = cumulative_sum(*parameters)

print("Total sum:", total)
print("Cumulative sums:", cum_sums)
