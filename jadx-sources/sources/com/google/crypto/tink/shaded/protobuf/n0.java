package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n0 {
    public static void a(Object obj, Object obj2) {
        m0 m0Var = (m0) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (m0Var.isEmpty()) {
            return;
        }
        Iterator it = m0Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static m0 b(Object obj, Object obj2) {
        m0 m0VarC = (m0) obj;
        m0 m0Var = (m0) obj2;
        if (!m0Var.isEmpty()) {
            if (!m0VarC.f4198a) {
                m0VarC = m0VarC.c();
            }
            m0VarC.b();
            if (!m0Var.isEmpty()) {
                m0VarC.putAll(m0Var);
            }
        }
        return m0VarC;
    }
}
