//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.03.03 at 07:33:19 GMT-05:00 
//


package org.apache.jorphan.tomcat.manager.impl;

public class StatusTypeImpl implements org.apache.jorphan.tomcat.manager.StatusType, com.sun.xml.bind.unmarshaller.UnmarshallableObject, com.sun.xml.bind.serializer.XMLSerializable, com.sun.xml.bind.validator.ValidatableObject
{

    protected org.apache.jorphan.tomcat.manager.Jvm _Jvm;
    protected com.sun.xml.bind.util.ListImpl _Connector = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    private final static com.sun.msv.grammar.Grammar schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize("\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/grammar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0001\u00fb`|ppsr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u00fd\u00b0:pp\u0000sq\u0000~\u0000\u0006\u0000\u00fd\u00b0/pp\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0000\u00fd\u00b0$ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u00fd\u00b0\u0019sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0007xq\u0000~\u0000\u0003\u0000\u00fd\u00b0\u0016q\u0000~\u0000\u0011psr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\u0010\u0001psr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0016psr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001dxq\u0000~\u0000\u0018t\u0000%org.apache.jorphan.tomcat.manager.Jvmt\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u001ct\u0000\u0003jvmt\u0000\u0000sq\u0000~\u0000\r\u0000\u00fd\u00b0=ppsq\u0000~\u0000\u0006\u0000\u00fd\u00b0:pp\u0000sq\u0000~\u0000\u0006\u0000\u00fd\u00b0/pp\u0000sq\u0000~\u0000\u000b\u0000\u00fd\u00b0$ppsq\u0000~\u0000\r\u0000\u00fd\u00b0\u0019q\u0000~\u0000\u0011psq\u0000~\u0000\u0012\u0000\u00fd\u00b0\u0016q\u0000~\u0000\u0011pq\u0000~\u0000\u0015q\u0000~\u0000\u0019q\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u0000+org.apache.jorphan.tomcat.manager.Connectorq\u0000~\u0000 sq\u0000~\u0000\u001ct\u0000\tconnectorq\u0000~\u0000#sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000/[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0006\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000\u0005ppppppppppppppppppppppq\u0000~\u0000\u000fq\u0000~\u0000(pppppppppq\u0000~\u0000\fq\u0000~\u0000\'pppppppppppppppppppppppq\u0000~\u0000$pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp");

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return org.apache.jorphan.tomcat.manager.StatusType.class;
    }

    public org.apache.jorphan.tomcat.manager.Jvm getJvm() {
        return _Jvm;
    }

    public void setJvm(org.apache.jorphan.tomcat.manager.Jvm value) {
        _Jvm = value;
    }

    public java.util.List getConnector() {
        return _Connector;
    }

    public com.sun.xml.bind.unmarshaller.ContentHandlerEx getUnmarshaller(com.sun.xml.bind.unmarshaller.UnmarshallingContext context) {
        return new org.apache.jorphan.tomcat.manager.impl.StatusTypeImpl.Unmarshaller(context);
    }

    public java.lang.Class getPrimaryInterfaceClass() {
        return PRIMARY_INTERFACE_CLASS();
    }

    public void serializeElements(com.sun.xml.bind.serializer.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = _Connector.size();
        if (_Jvm instanceof javax.xml.bind.Element) {
            context.childAsElements(((com.sun.xml.bind.serializer.XMLSerializable) _Jvm));
        } else {
            context.startElement("", "jvm");
            context.childAsAttributes(((com.sun.xml.bind.serializer.XMLSerializable) _Jvm));
            context.endAttributes();
            context.childAsElements(((com.sun.xml.bind.serializer.XMLSerializable) _Jvm));
            context.endElement();
        }
        while (idx2 != len2) {
            if (_Connector.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsElements(((com.sun.xml.bind.serializer.XMLSerializable) _Connector.get(idx2 ++)));
            } else {
                context.startElement("", "connector");
                int idx_1 = idx2;
                context.childAsAttributes(((com.sun.xml.bind.serializer.XMLSerializable) _Connector.get(idx_1 ++)));
                context.endAttributes();
                context.childAsElements(((com.sun.xml.bind.serializer.XMLSerializable) _Connector.get(idx2 ++)));
                context.endElement();
            }
        }
    }

    public void serializeAttributes(com.sun.xml.bind.serializer.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = _Connector.size();
    }

    public void serializeAttributeBodies(com.sun.xml.bind.serializer.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = _Connector.size();
    }

    public java.lang.Class getPrimaryInterface() {
        return (org.apache.jorphan.tomcat.manager.StatusType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.xml.bind.unmarshaller.ContentHandlerEx
    {


        public Unmarshaller(com.sun.xml.bind.unmarshaller.UnmarshallingContext context) {
            super(context, "-------");
        }

        protected com.sun.xml.bind.unmarshaller.UnmarshallableObject owner() {
            return org.apache.jorphan.tomcat.manager.impl.StatusTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, org.xml.sax.Attributes __atts)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            switch (state) {
                case  4 :
                    if (("" == ___uri)&&("threadInfo" == ___local)) {
                        _Connector.add(((org.apache.jorphan.tomcat.manager.impl.ConnectorImpl) spawnChildFromEnterElement((org.apache.jorphan.tomcat.manager.impl.ConnectorImpl.class), 5, ___uri, ___local, __atts)));
                        return ;
                    }
                    break;
                case  0 :
                    if (("" == ___uri)&&("jvm" == ___local)) {
                        context.pushAttributes(__atts);
                        state = 1;
                        return ;
                    }
                    break;
                case  6 :
                    if (("" == ___uri)&&("connector" == ___local)) {
                        context.pushAttributes(__atts);
                        goto4();
                        return ;
                    }
                    revertToParentFromEnterElement(___uri, ___local, __atts);
                    return ;
                case  3 :
                    if (("" == ___uri)&&("connector" == ___local)) {
                        context.pushAttributes(__atts);
                        goto4();
                        return ;
                    }
                    break;
                case  1 :
                    if (("" == ___uri)&&("memory" == ___local)) {
                        _Jvm = ((org.apache.jorphan.tomcat.manager.impl.JvmImpl) spawnChildFromEnterElement((org.apache.jorphan.tomcat.manager.impl.JvmImpl.class), 2, ___uri, ___local, __atts));
                        return ;
                    }
                    break;
            }
            super.enterElement(___uri, ___local, __atts);
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            switch (state) {
                case  6 :
                    revertToParentFromLeaveElement(___uri, ___local);
                    return ;
                case  5 :
                    if (("" == ___uri)&&("connector" == ___local)) {
                        context.popAttributes();
                        state = 6;
                        return ;
                    }
                    break;
                case  2 :
                    if (("" == ___uri)&&("jvm" == ___local)) {
                        context.popAttributes();
                        state = 3;
                        return ;
                    }
                    break;
            }
            super.leaveElement(___uri, ___local);
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            switch (state) {
                case  4 :
                    if (("" == ___uri)&&("name" == ___local)) {
                        _Connector.add(((org.apache.jorphan.tomcat.manager.impl.ConnectorImpl) spawnChildFromEnterAttribute((org.apache.jorphan.tomcat.manager.impl.ConnectorImpl.class), 5, ___uri, ___local)));
                        return ;
                    }
                    break;
                case  6 :
                    revertToParentFromEnterAttribute(___uri, ___local);
                    return ;
            }
            super.enterAttribute(___uri, ___local);
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            switch (state) {
                case  6 :
                    revertToParentFromLeaveAttribute(___uri, ___local);
                    return ;
            }
            super.leaveAttribute(___uri, ___local);
        }

        public void text(java.lang.String value)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            try {
                switch (state) {
                    case  6 :
                        revertToParentFromText(value);
                        return ;
                }
            } catch (java.lang.RuntimeException e) {
                handleUnexpectedTextException(value, e);
            }
        }

        public void leaveChild(int nextState)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            switch (nextState) {
                case  5 :
                    state = 5;
                    return ;
                case  2 :
                    state = 2;
                    return ;
            }
            super.leaveChild(nextState);
        }

        private void goto4()
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            int idx;
            state = 4;
            idx = context.getAttribute("", "name");
            if (idx >= 0) {
                context.consumeAttribute(idx);
                return ;
            }
        }

    }

}
