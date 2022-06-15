//642115003 Kan Katpark

class TriangleWithException extends Triangle  {

    public TriangleWithException(double a, double b, double c) throws IllegalTriangleException {
        super(a,b,c) ;
        if (!(validation(a, b, c)) ) {
            throw new IllegalTriangleException("Triangle size is incorrect");
        }
    }

    private boolean validation(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    
}