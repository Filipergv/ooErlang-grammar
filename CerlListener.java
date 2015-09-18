// Generated from Cerl.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CerlParser}.
 */
public interface CerlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CerlParser#forms}.
	 * @param ctx the parse tree
	 */
	void enterForms(CerlParser.FormsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#forms}.
	 * @param ctx the parse tree
	 */
	void exitForms(CerlParser.FormsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(CerlParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(CerlParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#oo_attributes_1}.
	 * @param ctx the parse tree
	 */
	void enterOo_attributes_1(CerlParser.Oo_attributes_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#oo_attributes_1}.
	 * @param ctx the parse tree
	 */
	void exitOo_attributes_1(CerlParser.Oo_attributes_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#oo_attributes}.
	 * @param ctx the parse tree
	 */
	void enterOo_attributes(CerlParser.Oo_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#oo_attributes}.
	 * @param ctx the parse tree
	 */
	void exitOo_attributes(CerlParser.Oo_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#oo_attribute}.
	 * @param ctx the parse tree
	 */
	void enterOo_attribute(CerlParser.Oo_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#oo_attribute}.
	 * @param ctx the parse tree
	 */
	void exitOo_attribute(CerlParser.Oo_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#oo_methods}.
	 * @param ctx the parse tree
	 */
	void enterOo_methods(CerlParser.Oo_methodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#oo_methods}.
	 * @param ctx the parse tree
	 */
	void exitOo_methods(CerlParser.Oo_methodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#tokAtom}.
	 * @param ctx the parse tree
	 */
	void enterTokAtom(CerlParser.TokAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#tokAtom}.
	 * @param ctx the parse tree
	 */
	void exitTokAtom(CerlParser.TokAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#tokVar}.
	 * @param ctx the parse tree
	 */
	void enterTokVar(CerlParser.TokVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#tokVar}.
	 * @param ctx the parse tree
	 */
	void exitTokVar(CerlParser.TokVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#tokFloat}.
	 * @param ctx the parse tree
	 */
	void enterTokFloat(CerlParser.TokFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#tokFloat}.
	 * @param ctx the parse tree
	 */
	void exitTokFloat(CerlParser.TokFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#tokInteger}.
	 * @param ctx the parse tree
	 */
	void enterTokInteger(CerlParser.TokIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#tokInteger}.
	 * @param ctx the parse tree
	 */
	void exitTokInteger(CerlParser.TokIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#tokChar}.
	 * @param ctx the parse tree
	 */
	void enterTokChar(CerlParser.TokCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#tokChar}.
	 * @param ctx the parse tree
	 */
	void exitTokChar(CerlParser.TokCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#tokString}.
	 * @param ctx the parse tree
	 */
	void enterTokString(CerlParser.TokStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#tokString}.
	 * @param ctx the parse tree
	 */
	void exitTokString(CerlParser.TokStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(CerlParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(CerlParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(CerlParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(CerlParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#specFun}.
	 * @param ctx the parse tree
	 */
	void enterSpecFun(CerlParser.SpecFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#specFun}.
	 * @param ctx the parse tree
	 */
	void exitSpecFun(CerlParser.SpecFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#typedAttrVal}.
	 * @param ctx the parse tree
	 */
	void enterTypedAttrVal(CerlParser.TypedAttrValContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#typedAttrVal}.
	 * @param ctx the parse tree
	 */
	void exitTypedAttrVal(CerlParser.TypedAttrValContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#typedRecordFields}.
	 * @param ctx the parse tree
	 */
	void enterTypedRecordFields(CerlParser.TypedRecordFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#typedRecordFields}.
	 * @param ctx the parse tree
	 */
	void exitTypedRecordFields(CerlParser.TypedRecordFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#typedExprs}.
	 * @param ctx the parse tree
	 */
	void enterTypedExprs(CerlParser.TypedExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#typedExprs}.
	 * @param ctx the parse tree
	 */
	void exitTypedExprs(CerlParser.TypedExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#typedExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypedExpr(CerlParser.TypedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#typedExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypedExpr(CerlParser.TypedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#typeSigs}.
	 * @param ctx the parse tree
	 */
	void enterTypeSigs(CerlParser.TypeSigsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#typeSigs}.
	 * @param ctx the parse tree
	 */
	void exitTypeSigs(CerlParser.TypeSigsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#typeSig}.
	 * @param ctx the parse tree
	 */
	void enterTypeSig(CerlParser.TypeSigContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#typeSig}.
	 * @param ctx the parse tree
	 */
	void exitTypeSig(CerlParser.TypeSigContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#typeGuards}.
	 * @param ctx the parse tree
	 */
	void enterTypeGuards(CerlParser.TypeGuardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#typeGuards}.
	 * @param ctx the parse tree
	 */
	void exitTypeGuards(CerlParser.TypeGuardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#typeGuard}.
	 * @param ctx the parse tree
	 */
	void enterTypeGuard(CerlParser.TypeGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#typeGuard}.
	 * @param ctx the parse tree
	 */
	void exitTypeGuard(CerlParser.TypeGuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#topTypes}.
	 * @param ctx the parse tree
	 */
	void enterTopTypes(CerlParser.TopTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#topTypes}.
	 * @param ctx the parse tree
	 */
	void exitTopTypes(CerlParser.TopTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#topType}.
	 * @param ctx the parse tree
	 */
	void enterTopType(CerlParser.TopTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#topType}.
	 * @param ctx the parse tree
	 */
	void exitTopType(CerlParser.TopTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#topType100}.
	 * @param ctx the parse tree
	 */
	void enterTopType100(CerlParser.TopType100Context ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#topType100}.
	 * @param ctx the parse tree
	 */
	void exitTopType100(CerlParser.TopType100Context ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CerlParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CerlParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#funType100}.
	 * @param ctx the parse tree
	 */
	void enterFunType100(CerlParser.FunType100Context ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#funType100}.
	 * @param ctx the parse tree
	 */
	void exitFunType100(CerlParser.FunType100Context ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#funType}.
	 * @param ctx the parse tree
	 */
	void enterFunType(CerlParser.FunTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#funType}.
	 * @param ctx the parse tree
	 */
	void exitFunType(CerlParser.FunTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#mapPairTypes}.
	 * @param ctx the parse tree
	 */
	void enterMapPairTypes(CerlParser.MapPairTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#mapPairTypes}.
	 * @param ctx the parse tree
	 */
	void exitMapPairTypes(CerlParser.MapPairTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#mapPairType}.
	 * @param ctx the parse tree
	 */
	void enterMapPairType(CerlParser.MapPairTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#mapPairType}.
	 * @param ctx the parse tree
	 */
	void exitMapPairType(CerlParser.MapPairTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#fieldTypes}.
	 * @param ctx the parse tree
	 */
	void enterFieldTypes(CerlParser.FieldTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#fieldTypes}.
	 * @param ctx the parse tree
	 */
	void exitFieldTypes(CerlParser.FieldTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void enterFieldType(CerlParser.FieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void exitFieldType(CerlParser.FieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#binaryType}.
	 * @param ctx the parse tree
	 */
	void enterBinaryType(CerlParser.BinaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#binaryType}.
	 * @param ctx the parse tree
	 */
	void exitBinaryType(CerlParser.BinaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#binBaseType}.
	 * @param ctx the parse tree
	 */
	void enterBinBaseType(CerlParser.BinBaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#binBaseType}.
	 * @param ctx the parse tree
	 */
	void exitBinBaseType(CerlParser.BinBaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#binUnitType}.
	 * @param ctx the parse tree
	 */
	void enterBinUnitType(CerlParser.BinUnitTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#binUnitType}.
	 * @param ctx the parse tree
	 */
	void exitBinUnitType(CerlParser.BinUnitTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#attrVal}.
	 * @param ctx the parse tree
	 */
	void enterAttrVal(CerlParser.AttrValContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#attrVal}.
	 * @param ctx the parse tree
	 */
	void exitAttrVal(CerlParser.AttrValContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CerlParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CerlParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#functionClause}.
	 * @param ctx the parse tree
	 */
	void enterFunctionClause(CerlParser.FunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#functionClause}.
	 * @param ctx the parse tree
	 */
	void exitFunctionClause(CerlParser.FunctionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#clauseArgs}.
	 * @param ctx the parse tree
	 */
	void enterClauseArgs(CerlParser.ClauseArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#clauseArgs}.
	 * @param ctx the parse tree
	 */
	void exitClauseArgs(CerlParser.ClauseArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#clauseGuard}.
	 * @param ctx the parse tree
	 */
	void enterClauseGuard(CerlParser.ClauseGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#clauseGuard}.
	 * @param ctx the parse tree
	 */
	void exitClauseGuard(CerlParser.ClauseGuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#clauseBody}.
	 * @param ctx the parse tree
	 */
	void enterClauseBody(CerlParser.ClauseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#clauseBody}.
	 * @param ctx the parse tree
	 */
	void exitClauseBody(CerlParser.ClauseBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CerlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CerlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#exprMax}.
	 * @param ctx the parse tree
	 */
	void enterExprMax(CerlParser.ExprMaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#exprMax}.
	 * @param ctx the parse tree
	 */
	void exitExprMax(CerlParser.ExprMaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CerlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CerlParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#remoteExpr}.
	 * @param ctx the parse tree
	 */
	void enterRemoteExpr(CerlParser.RemoteExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#remoteExpr}.
	 * @param ctx the parse tree
	 */
	void exitRemoteExpr(CerlParser.RemoteExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(CerlParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(CerlParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#tail}.
	 * @param ctx the parse tree
	 */
	void enterTail(CerlParser.TailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#tail}.
	 * @param ctx the parse tree
	 */
	void exitTail(CerlParser.TailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(CerlParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(CerlParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#binElements}.
	 * @param ctx the parse tree
	 */
	void enterBinElements(CerlParser.BinElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#binElements}.
	 * @param ctx the parse tree
	 */
	void exitBinElements(CerlParser.BinElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#binElement}.
	 * @param ctx the parse tree
	 */
	void enterBinElement(CerlParser.BinElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#binElement}.
	 * @param ctx the parse tree
	 */
	void exitBinElement(CerlParser.BinElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(CerlParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(CerlParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#optBitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void enterOptBitSizeExpr(CerlParser.OptBitSizeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#optBitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void exitOptBitSizeExpr(CerlParser.OptBitSizeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#optBitTypeList}.
	 * @param ctx the parse tree
	 */
	void enterOptBitTypeList(CerlParser.OptBitTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#optBitTypeList}.
	 * @param ctx the parse tree
	 */
	void exitOptBitTypeList(CerlParser.OptBitTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#bitTypeList}.
	 * @param ctx the parse tree
	 */
	void enterBitTypeList(CerlParser.BitTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#bitTypeList}.
	 * @param ctx the parse tree
	 */
	void exitBitTypeList(CerlParser.BitTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#bitType}.
	 * @param ctx the parse tree
	 */
	void enterBitType(CerlParser.BitTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#bitType}.
	 * @param ctx the parse tree
	 */
	void exitBitType(CerlParser.BitTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#bitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitSizeExpr(CerlParser.BitSizeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#bitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitSizeExpr(CerlParser.BitSizeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void enterListComprehension(CerlParser.ListComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void exitListComprehension(CerlParser.ListComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#binaryComprehension}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComprehension(CerlParser.BinaryComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#binaryComprehension}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComprehension(CerlParser.BinaryComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#lcExprs}.
	 * @param ctx the parse tree
	 */
	void enterLcExprs(CerlParser.LcExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#lcExprs}.
	 * @param ctx the parse tree
	 */
	void exitLcExprs(CerlParser.LcExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#lcExpr}.
	 * @param ctx the parse tree
	 */
	void enterLcExpr(CerlParser.LcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#lcExpr}.
	 * @param ctx the parse tree
	 */
	void exitLcExpr(CerlParser.LcExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(CerlParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(CerlParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#bracedExpr}.
	 * @param ctx the parse tree
	 */
	void enterBracedExpr(CerlParser.BracedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#bracedExpr}.
	 * @param ctx the parse tree
	 */
	void exitBracedExpr(CerlParser.BracedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#beginEndExpr}.
	 * @param ctx the parse tree
	 */
	void enterBeginEndExpr(CerlParser.BeginEndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#beginEndExpr}.
	 * @param ctx the parse tree
	 */
	void exitBeginEndExpr(CerlParser.BeginEndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(CerlParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(CerlParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#mapFields}.
	 * @param ctx the parse tree
	 */
	void enterMapFields(CerlParser.MapFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#mapFields}.
	 * @param ctx the parse tree
	 */
	void exitMapFields(CerlParser.MapFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#mapField}.
	 * @param ctx the parse tree
	 */
	void enterMapField(CerlParser.MapFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#mapField}.
	 * @param ctx the parse tree
	 */
	void exitMapField(CerlParser.MapFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#recordExpr}.
	 * @param ctx the parse tree
	 */
	void enterRecordExpr(CerlParser.RecordExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#recordExpr}.
	 * @param ctx the parse tree
	 */
	void exitRecordExpr(CerlParser.RecordExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#recordTuple}.
	 * @param ctx the parse tree
	 */
	void enterRecordTuple(CerlParser.RecordTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#recordTuple}.
	 * @param ctx the parse tree
	 */
	void exitRecordTuple(CerlParser.RecordTupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#recordFields}.
	 * @param ctx the parse tree
	 */
	void enterRecordFields(CerlParser.RecordFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#recordFields}.
	 * @param ctx the parse tree
	 */
	void exitRecordFields(CerlParser.RecordFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#recordField}.
	 * @param ctx the parse tree
	 */
	void enterRecordField(CerlParser.RecordFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#recordField}.
	 * @param ctx the parse tree
	 */
	void exitRecordField(CerlParser.RecordFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(CerlParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(CerlParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#ifClauses}.
	 * @param ctx the parse tree
	 */
	void enterIfClauses(CerlParser.IfClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#ifClauses}.
	 * @param ctx the parse tree
	 */
	void exitIfClauses(CerlParser.IfClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#ifClause}.
	 * @param ctx the parse tree
	 */
	void enterIfClause(CerlParser.IfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#ifClause}.
	 * @param ctx the parse tree
	 */
	void exitIfClause(CerlParser.IfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpr(CerlParser.CaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpr(CerlParser.CaseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#crClauses}.
	 * @param ctx the parse tree
	 */
	void enterCrClauses(CerlParser.CrClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#crClauses}.
	 * @param ctx the parse tree
	 */
	void exitCrClauses(CerlParser.CrClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#crClause}.
	 * @param ctx the parse tree
	 */
	void enterCrClause(CerlParser.CrClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#crClause}.
	 * @param ctx the parse tree
	 */
	void exitCrClause(CerlParser.CrClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#receiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterReceiveExpr(CerlParser.ReceiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#receiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitReceiveExpr(CerlParser.ReceiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#funExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunExpr(CerlParser.FunExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#funExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunExpr(CerlParser.FunExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#atomOrVar}.
	 * @param ctx the parse tree
	 */
	void enterAtomOrVar(CerlParser.AtomOrVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#atomOrVar}.
	 * @param ctx the parse tree
	 */
	void exitAtomOrVar(CerlParser.AtomOrVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#integerOrVar}.
	 * @param ctx the parse tree
	 */
	void enterIntegerOrVar(CerlParser.IntegerOrVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#integerOrVar}.
	 * @param ctx the parse tree
	 */
	void exitIntegerOrVar(CerlParser.IntegerOrVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#funClauses}.
	 * @param ctx the parse tree
	 */
	void enterFunClauses(CerlParser.FunClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#funClauses}.
	 * @param ctx the parse tree
	 */
	void exitFunClauses(CerlParser.FunClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#funClause}.
	 * @param ctx the parse tree
	 */
	void enterFunClause(CerlParser.FunClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#funClause}.
	 * @param ctx the parse tree
	 */
	void exitFunClause(CerlParser.FunClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#tryExpr}.
	 * @param ctx the parse tree
	 */
	void enterTryExpr(CerlParser.TryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#tryExpr}.
	 * @param ctx the parse tree
	 */
	void exitTryExpr(CerlParser.TryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	void enterTryCatch(CerlParser.TryCatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	void exitTryCatch(CerlParser.TryCatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#tryClauses}.
	 * @param ctx the parse tree
	 */
	void enterTryClauses(CerlParser.TryClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#tryClauses}.
	 * @param ctx the parse tree
	 */
	void exitTryClauses(CerlParser.TryClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#tryClause}.
	 * @param ctx the parse tree
	 */
	void enterTryClause(CerlParser.TryClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#tryClause}.
	 * @param ctx the parse tree
	 */
	void exitTryClause(CerlParser.TryClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(CerlParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(CerlParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(CerlParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(CerlParser.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(CerlParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(CerlParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAtomic(CerlParser.AtomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAtomic(CerlParser.AtomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOp(CerlParser.PrefixOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOp(CerlParser.PrefixOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(CerlParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(CerlParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(CerlParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(CerlParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#listOp}.
	 * @param ctx the parse tree
	 */
	void enterListOp(CerlParser.ListOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#listOp}.
	 * @param ctx the parse tree
	 */
	void exitListOp(CerlParser.ListOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(CerlParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(CerlParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#ruleClauses}.
	 * @param ctx the parse tree
	 */
	void enterRuleClauses(CerlParser.RuleClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#ruleClauses}.
	 * @param ctx the parse tree
	 */
	void exitRuleClauses(CerlParser.RuleClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#ruleClause}.
	 * @param ctx the parse tree
	 */
	void enterRuleClause(CerlParser.RuleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#ruleClause}.
	 * @param ctx the parse tree
	 */
	void exitRuleClause(CerlParser.RuleClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CerlParser#ruleBody}.
	 * @param ctx the parse tree
	 */
	void enterRuleBody(CerlParser.RuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CerlParser#ruleBody}.
	 * @param ctx the parse tree
	 */
	void exitRuleBody(CerlParser.RuleBodyContext ctx);
}