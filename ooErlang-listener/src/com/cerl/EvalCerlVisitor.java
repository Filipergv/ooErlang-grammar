package com.cerl;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.cerl.CerlParser.AddContext;
import com.cerl.CerlParser.ArgumentListContext;
import com.cerl.CerlParser.ArithmeticBitshiftLeftContext;
import com.cerl.CerlParser.ArithmeticBitwiseXorContext;
import com.cerl.CerlParser.AtomOrVarContext;
import com.cerl.CerlParser.AtomicContext;
import com.cerl.CerlParser.AttrValContext;
import com.cerl.CerlParser.AttributeContext;
import com.cerl.CerlParser.BeginEndExprContext;
import com.cerl.CerlParser.BinBaseTypeContext;
import com.cerl.CerlParser.BinElementContext;
import com.cerl.CerlParser.BinElementsContext;
import com.cerl.CerlParser.BinUnitTypeContext;
import com.cerl.CerlParser.BinaryComprehensionContext;
import com.cerl.CerlParser.BinaryContext;
import com.cerl.CerlParser.BinaryTypeContext;
import com.cerl.CerlParser.BitExprContext;
import com.cerl.CerlParser.BitSizeExprContext;
import com.cerl.CerlParser.BitTypeContext;
import com.cerl.CerlParser.BitTypeListContext;
import com.cerl.CerlParser.BitshiftRightContext;
import com.cerl.CerlParser.BitwiseAndContext;
import com.cerl.CerlParser.BitwiseOrContext;
import com.cerl.CerlParser.BracedExprContext;
import com.cerl.CerlParser.CaseExprContext;
import com.cerl.CerlParser.ClauseArgsContext;
import com.cerl.CerlParser.ClauseBodyContext;
import com.cerl.CerlParser.ClauseGuardContext;
import com.cerl.CerlParser.CrClauseContext;
import com.cerl.CerlParser.CrClausesContext;
import com.cerl.CerlParser.DivContext;
import com.cerl.CerlParser.EqualToContext;
import com.cerl.CerlParser.ExactlyEqualToContext;
import com.cerl.CerlParser.ExactlyNotEqualToContext;
import com.cerl.CerlParser.ExprContext;
import com.cerl.CerlParser.ExprMaxContext;
import com.cerl.CerlParser.ExprsContext;
import com.cerl.CerlParser.FieldTypeContext;
import com.cerl.CerlParser.FieldTypesContext;
import com.cerl.CerlParser.FormContext;
import com.cerl.CerlParser.FormsContext;
import com.cerl.CerlParser.FunClauseContext;
import com.cerl.CerlParser.FunClausesContext;
import com.cerl.CerlParser.FunExprContext;
import com.cerl.CerlParser.FunType100Context;
import com.cerl.CerlParser.FunTypeContext;
import com.cerl.CerlParser.FunctionCallContext;
import com.cerl.CerlParser.FunctionClauseContext;
import com.cerl.CerlParser.FunctionContext;
import com.cerl.CerlParser.GreaterThanContext;
import com.cerl.CerlParser.GreaterThanOrEqualToContext;
import com.cerl.CerlParser.GuardContext;
import com.cerl.CerlParser.IfClauseContext;
import com.cerl.CerlParser.IfClausesContext;
import com.cerl.CerlParser.IfExprContext;
import com.cerl.CerlParser.IntegerDivisionContext;
import com.cerl.CerlParser.IntegerOrVarContext;
import com.cerl.CerlParser.IntegerRemainderContext;
import com.cerl.CerlParser.LcExprContext;
import com.cerl.CerlParser.LcExprsContext;
import com.cerl.CerlParser.LessThanContext;
import com.cerl.CerlParser.LessThanOrEqualToContext;
import com.cerl.CerlParser.ListComprehensionContext;
import com.cerl.CerlParser.ListConcatenationContext;
import com.cerl.CerlParser.ListContext;
import com.cerl.CerlParser.ListSubtractionContext;
import com.cerl.CerlParser.LogicalAndContext;
import com.cerl.CerlParser.LogicalOrContext;
import com.cerl.CerlParser.LogicalXorContext;
import com.cerl.CerlParser.MapContext;
import com.cerl.CerlParser.MapFieldContext;
import com.cerl.CerlParser.MapFieldsContext;
import com.cerl.CerlParser.MapPairTypeContext;
import com.cerl.CerlParser.MapPairTypesContext;
import com.cerl.CerlParser.MulContext;
import com.cerl.CerlParser.NotEqualToContext;
import com.cerl.CerlParser.Oo_attributeContext;
import com.cerl.CerlParser.Oo_attributesContext;
import com.cerl.CerlParser.Oo_attributes_1Context;
import com.cerl.CerlParser.Oo_methodsContext;
import com.cerl.CerlParser.OptBitSizeExprContext;
import com.cerl.CerlParser.OptBitTypeListContext;
import com.cerl.CerlParser.ReceiveExprContext;
import com.cerl.CerlParser.RecordExprContext;
import com.cerl.CerlParser.RecordFieldContext;
import com.cerl.CerlParser.RecordFieldsContext;
import com.cerl.CerlParser.RecordTupleContext;
import com.cerl.CerlParser.RemoteExprContext;
import com.cerl.CerlParser.RuleBodyContext;
import com.cerl.CerlParser.RuleClauseContext;
import com.cerl.CerlParser.RuleClausesContext;
import com.cerl.CerlParser.SpecFunContext;
import com.cerl.CerlParser.SubContext;
import com.cerl.CerlParser.TailContext;
import com.cerl.CerlParser.TokAtomContext;
import com.cerl.CerlParser.TokCharContext;
import com.cerl.CerlParser.TokFloatContext;
import com.cerl.CerlParser.TokIntegerContext;
import com.cerl.CerlParser.TokStringContext;
import com.cerl.CerlParser.TokVarContext;
import com.cerl.CerlParser.TopType100Context;
import com.cerl.CerlParser.TopTypeContext;
import com.cerl.CerlParser.TopTypesContext;
import com.cerl.CerlParser.TryCatchContext;
import com.cerl.CerlParser.TryClauseContext;
import com.cerl.CerlParser.TryClausesContext;
import com.cerl.CerlParser.TryExprContext;
import com.cerl.CerlParser.TupleContext;
import com.cerl.CerlParser.TypeContext;
import com.cerl.CerlParser.TypeGuardContext;
import com.cerl.CerlParser.TypeGuardsContext;
import com.cerl.CerlParser.TypeSigContext;
import com.cerl.CerlParser.TypeSigsContext;
import com.cerl.CerlParser.TypeSpecContext;
import com.cerl.CerlParser.TypedAttrValContext;
import com.cerl.CerlParser.TypedExprContext;
import com.cerl.CerlParser.TypedExprsContext;
import com.cerl.CerlParser.TypedRecordFieldsContext;
import com.cerl.CerlParser.UnaryAddContext;
import com.cerl.CerlParser.UnaryBitwiseNotContext;
import com.cerl.CerlParser.UnaryLogicalNotContext;
import com.cerl.CerlParser.UnarySubContext;

public class EvalCerlVisitor implements CerlVisitor<Object> {

	@Override
	public Object visit(ParseTree arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitForms(FormsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitForm(FormContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitOo_attributes_1(Oo_attributes_1Context ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitOo_attributes(Oo_attributesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitOo_attribute(Oo_attributeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitOo_methods(Oo_methodsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTokAtom(TokAtomContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTokVar(TokVarContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTokFloat(TokFloatContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTokInteger(TokIntegerContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTokChar(TokCharContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTokString(TokStringContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitAttribute(AttributeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTypeSpec(TypeSpecContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitSpecFun(SpecFunContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTypedAttrVal(TypedAttrValContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTypedRecordFields(TypedRecordFieldsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTypedExprs(TypedExprsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTypedExpr(TypedExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTypeSigs(TypeSigsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTypeSig(TypeSigContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTypeGuards(TypeGuardsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTypeGuard(TypeGuardContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTopTypes(TopTypesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTopType(TopTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTopType100(TopType100Context ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitType(TypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitFunType100(FunType100Context ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitFunType(FunTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitMapPairTypes(MapPairTypesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitMapPairType(MapPairTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitFieldTypes(FieldTypesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitFieldType(FieldTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBinaryType(BinaryTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBinBaseType(BinBaseTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBinUnitType(BinUnitTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitAttrVal(AttrValContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitFunction(FunctionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitFunctionClause(FunctionClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitClauseArgs(ClauseArgsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitClauseGuard(ClauseGuardContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitClauseBody(ClauseBodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitExpr(ExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitExprMax(ExprMaxContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitFunctionCall(FunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitRemoteExpr(RemoteExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitList(ListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTail(TailContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBinary(BinaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBinElements(BinElementsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBinElement(BinElementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBitExpr(BitExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitOptBitSizeExpr(OptBitSizeExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitOptBitTypeList(OptBitTypeListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBitTypeList(BitTypeListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBitType(BitTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBitSizeExpr(BitSizeExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitListComprehension(ListComprehensionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBinaryComprehension(BinaryComprehensionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitLcExprs(LcExprsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitLcExpr(LcExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTuple(TupleContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBracedExpr(BracedExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBeginEndExpr(BeginEndExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitMap(MapContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitMapFields(MapFieldsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitMapField(MapFieldContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitRecordExpr(RecordExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitRecordTuple(RecordTupleContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitRecordFields(RecordFieldsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitRecordField(RecordFieldContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitIfExpr(IfExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitIfClauses(IfClausesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitIfClause(IfClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitCaseExpr(CaseExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitCrClauses(CrClausesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitCrClause(CrClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitReceiveExpr(ReceiveExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitFunExpr(FunExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitAtomOrVar(AtomOrVarContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitIntegerOrVar(IntegerOrVarContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitFunClauses(FunClausesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitFunClause(FunClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTryExpr(TryExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTryCatch(TryCatchContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTryClauses(TryClausesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTryClause(TryClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitArgumentList(ArgumentListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitExprs(ExprsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitGuard(GuardContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitAtomic(AtomicContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitUnaryAdd(UnaryAddContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitUnarySub(UnarySubContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitUnaryBitwiseNot(UnaryBitwiseNotContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitUnaryLogicalNot(UnaryLogicalNotContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitDiv(DivContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitMul(MulContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitIntegerDivision(IntegerDivisionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitIntegerRemainder(IntegerRemainderContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBitwiseAnd(BitwiseAndContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitLogicalAnd(LogicalAndContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitAdd(AddContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitSub(SubContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBitwiseOr(BitwiseOrContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitArithmeticBitwiseXor(ArithmeticBitwiseXorContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitArithmeticBitshiftLeft(ArithmeticBitshiftLeftContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBitshiftRight(BitshiftRightContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitLogicalOr(LogicalOrContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitLogicalXor(LogicalXorContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitListConcatenation(ListConcatenationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitListSubtraction(ListSubtractionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitEqualTo(EqualToContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitNotEqualTo(NotEqualToContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitLessThanOrEqualTo(LessThanOrEqualToContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitLessThan(LessThanContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitGreaterThanOrEqualTo(GreaterThanOrEqualToContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitGreaterThan(GreaterThanContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitExactlyEqualTo(ExactlyEqualToContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitExactlyNotEqualTo(ExactlyNotEqualToContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitRuleClauses(RuleClausesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitRuleClause(RuleClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitRuleBody(RuleBodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

}
