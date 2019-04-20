trait Monad[F[_]]{
  def unit[A](a: => A): F[A]
  def flatMap[A,B](ma: F[A])(f:A=>F[B]): F[B]
}

case class State[S,A](run: S=>(A,S)) {
  def map[B](f: A=>B): State[S,B] =
    State(S => {
      val (a, s1) = run(S)
      (f(a), s1)
    })
  def flatMap[B](f:A => State[S,B]): State[S,B] =
    State(s => {
      val (a, s1) = run(S)
      f(a).run(s1)
    })
}

type IntState[A] = State[Int, A]

object MonadTest extends Monad[IntState] {
  def unit[A](a: => A) : IntState[A] = State(s => (a, s))
  def flatMap[A,B](st: IntState[A])(f: A => IntState[B]): IntState[B] = st flatMap f
}
