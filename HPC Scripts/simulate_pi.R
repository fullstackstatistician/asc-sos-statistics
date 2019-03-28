simulate_pi <- function(n) {
  pi.vec <- rep(0, n)
  number_inside_quarter_circle <- 0
  for (simulation.i in 1:n) {
    x <- runif(1, -1, 1)
    y <- runif(1, -1, 1)
    if (sqrt(x^2 + y^2) <= 1) {
      number_inside_quarter_circle <- number_inside_quarter_circle + 1
    }
    proportion_inside_quarter_circle <- number_inside_circle / simulation.i
    pi_hat <- proportion_inside_quarter_circle * 4
    pi.vec[simulation.i] = pi_hat
  }
  return(pi.vec)
}
