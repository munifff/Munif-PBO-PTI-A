package tugasSoal;
//no 5
public class PieceWorker extends Employee {
    private double piecesProduced;
    private double wagePerPiece;

    public PieceWorker(String name, String noKTP, double piecesProduced, double wagePerPiece) {
        super(name, noKTP);
        this.piecesProduced = piecesProduced;
        this.wagePerPiece = wagePerPiece;
    }

    public double getWagePerPiece() {
        return wagePerPiece;
    }

    public double getPiecesProduced() {
        return piecesProduced;
    }

    @Override
    public double earnings() {
        return getPiecesProduced() * getWagePerPiece();
    }

    @Override
    public String toString() {
        return String.format("Piece worker: " + super.toString() +
                             "\nPieces produced: %.2f\nWage per piece: $%,.2f",
                             getPiecesProduced(), getWagePerPiece());
    }
}
