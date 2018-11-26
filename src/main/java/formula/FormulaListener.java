// Generated from Formula.g4 by ANTLR 4.5

    package formula;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FormulaParser}.
 */
public interface FormulaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FormulaParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(FormulaParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(FormulaParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(FormulaParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(FormulaParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FormulaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FormulaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(FormulaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(FormulaParser.TermContext ctx);
}