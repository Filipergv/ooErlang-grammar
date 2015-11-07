package com.cerl;
// Generated from Cerl.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CerlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CerlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CerlParser#forms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForms(CerlParser.FormsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(CerlParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#oo_attributes_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOo_attributes_1(CerlParser.Oo_attributes_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#oo_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOo_attributes(CerlParser.Oo_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#oo_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOo_attribute(CerlParser.Oo_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#oo_methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOo_methods(CerlParser.Oo_methodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#tokAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokAtom(CerlParser.TokAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#tokVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokVar(CerlParser.TokVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#tokFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokFloat(CerlParser.TokFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#tokInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokInteger(CerlParser.TokIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#tokChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokChar(CerlParser.TokCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#tokString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokString(CerlParser.TokStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(CerlParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(CerlParser.TypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#specFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecFun(CerlParser.SpecFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#typedAttrVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedAttrVal(CerlParser.TypedAttrValContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#typedRecordFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedRecordFields(CerlParser.TypedRecordFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#typedExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedExprs(CerlParser.TypedExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#typedExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedExpr(CerlParser.TypedExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#typeSigs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSigs(CerlParser.TypeSigsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#typeSig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSig(CerlParser.TypeSigContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#typeGuards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeGuards(CerlParser.TypeGuardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#typeGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeGuard(CerlParser.TypeGuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#topTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopTypes(CerlParser.TopTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#topType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopType(CerlParser.TopTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#topType100}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopType100(CerlParser.TopType100Context ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CerlParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#funType100}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunType100(CerlParser.FunType100Context ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#funType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunType(CerlParser.FunTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#mapPairTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapPairTypes(CerlParser.MapPairTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#mapPairType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapPairType(CerlParser.MapPairTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#fieldTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldTypes(CerlParser.FieldTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#fieldType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldType(CerlParser.FieldTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#binaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryType(CerlParser.BinaryTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#binBaseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinBaseType(CerlParser.BinBaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#binUnitType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinUnitType(CerlParser.BinUnitTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#attrVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrVal(CerlParser.AttrValContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CerlParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#functionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionClause(CerlParser.FunctionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#clauseArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseArgs(CerlParser.ClauseArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#clauseGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseGuard(CerlParser.ClauseGuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#clauseBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseBody(CerlParser.ClauseBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CerlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#exprMax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMax(CerlParser.ExprMaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CerlParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#remoteExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoteExpr(CerlParser.RemoteExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(CerlParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTail(CerlParser.TailContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(CerlParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#binElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinElements(CerlParser.BinElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#binElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinElement(CerlParser.BinElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(CerlParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#optBitSizeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptBitSizeExpr(CerlParser.OptBitSizeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#optBitTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptBitTypeList(CerlParser.OptBitTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#bitTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitTypeList(CerlParser.BitTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#bitType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitType(CerlParser.BitTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#bitSizeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitSizeExpr(CerlParser.BitSizeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#listComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListComprehension(CerlParser.ListComprehensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#binaryComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryComprehension(CerlParser.BinaryComprehensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#lcExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcExprs(CerlParser.LcExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#lcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcExpr(CerlParser.LcExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(CerlParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#bracedExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedExpr(CerlParser.BracedExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#beginEndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginEndExpr(CerlParser.BeginEndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(CerlParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#mapFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapFields(CerlParser.MapFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#mapField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapField(CerlParser.MapFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#recordExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordExpr(CerlParser.RecordExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#recordTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordTuple(CerlParser.RecordTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#recordFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordFields(CerlParser.RecordFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#recordField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordField(CerlParser.RecordFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(CerlParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#ifClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfClauses(CerlParser.IfClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#ifClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfClause(CerlParser.IfClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#caseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpr(CerlParser.CaseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#crClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrClauses(CerlParser.CrClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#crClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrClause(CerlParser.CrClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#receiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveExpr(CerlParser.ReceiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#funExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunExpr(CerlParser.FunExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#atomOrVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomOrVar(CerlParser.AtomOrVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#integerOrVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerOrVar(CerlParser.IntegerOrVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#funClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunClauses(CerlParser.FunClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#funClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunClause(CerlParser.FunClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#tryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExpr(CerlParser.TryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#tryCatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatch(CerlParser.TryCatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#tryClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryClauses(CerlParser.TryClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#tryClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryClause(CerlParser.TryClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(CerlParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprs(CerlParser.ExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(CerlParser.GuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic(CerlParser.AtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryAdd}
	 * labeled alternative in {@link CerlParser#prefixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryAdd(CerlParser.UnaryAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnarySub}
	 * labeled alternative in {@link CerlParser#prefixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnarySub(CerlParser.UnarySubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryBitwiseNot}
	 * labeled alternative in {@link CerlParser#prefixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryBitwiseNot(CerlParser.UnaryBitwiseNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryLogicalNot}
	 * labeled alternative in {@link CerlParser#prefixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryLogicalNot(CerlParser.UnaryLogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link CerlParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(CerlParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link CerlParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(CerlParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerDivision}
	 * labeled alternative in {@link CerlParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerDivision(CerlParser.IntegerDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerRemainder}
	 * labeled alternative in {@link CerlParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerRemainder(CerlParser.IntegerRemainderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseAnd}
	 * labeled alternative in {@link CerlParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAnd(CerlParser.BitwiseAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAnd}
	 * labeled alternative in {@link CerlParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAnd(CerlParser.LogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CerlParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(CerlParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link CerlParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(CerlParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseOr}
	 * labeled alternative in {@link CerlParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOr(CerlParser.BitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticBitwiseXor}
	 * labeled alternative in {@link CerlParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBitwiseXor(CerlParser.ArithmeticBitwiseXorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticBitshiftLeft}
	 * labeled alternative in {@link CerlParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBitshiftLeft(CerlParser.ArithmeticBitshiftLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitshiftRight}
	 * labeled alternative in {@link CerlParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitshiftRight(CerlParser.BitshiftRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOr}
	 * labeled alternative in {@link CerlParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOr(CerlParser.LogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalXor}
	 * labeled alternative in {@link CerlParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalXor(CerlParser.LogicalXorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListConcatenation}
	 * labeled alternative in {@link CerlParser#listOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListConcatenation(CerlParser.ListConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListSubtraction}
	 * labeled alternative in {@link CerlParser#listOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSubtraction(CerlParser.ListSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualTo}
	 * labeled alternative in {@link CerlParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualTo(CerlParser.EqualToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualTo}
	 * labeled alternative in {@link CerlParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualTo(CerlParser.NotEqualToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanOrEqualTo}
	 * labeled alternative in {@link CerlParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEqualTo(CerlParser.LessThanOrEqualToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link CerlParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(CerlParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanOrEqualTo}
	 * labeled alternative in {@link CerlParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqualTo(CerlParser.GreaterThanOrEqualToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link CerlParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(CerlParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExactlyEqualTo}
	 * labeled alternative in {@link CerlParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExactlyEqualTo(CerlParser.ExactlyEqualToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExactlyNotEqualTo}
	 * labeled alternative in {@link CerlParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExactlyNotEqualTo(CerlParser.ExactlyNotEqualToContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#ruleClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClauses(CerlParser.RuleClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#ruleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClause(CerlParser.RuleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CerlParser#ruleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleBody(CerlParser.RuleBodyContext ctx);
}