package o5;

import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends w {
    private static final e DEFAULT_INSTANCE;
    private static volatile s0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private x strings_ = v0.f1028d;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        w.j(e.class, eVar);
    }

    public static void l(e eVar, Iterable iterable) {
        x xVar = eVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) xVar).f895a) {
            v0 v0Var = (v0) xVar;
            int i10 = v0Var.f1030c;
            eVar.strings_ = v0Var.i(i10 == 0 ? 10 : i10 * 2);
        }
        RandomAccess randomAccess = eVar.strings_;
        Charset charset = y.f1035a;
        if (iterable instanceof c0) {
            List listA = ((c0) iterable).a();
            if (randomAccess != null) {
                throw new ClassCastException();
            }
            ((v0) randomAccess).getClass();
            Iterator it = listA.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof androidx.datastore.preferences.protobuf.g) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                androidx.datastore.preferences.protobuf.g.i(0, bArr, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof t0) {
            ((androidx.datastore.preferences.protobuf.b) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((v0) randomAccess).f1030c);
        }
        v0 v0Var2 = (v0) randomAccess;
        int i11 = v0Var2.f1030c;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (v0Var2.f1030c - i11) + " is null.";
                for (int i12 = v0Var2.f1030c - 1; i12 >= i11; i12--) {
                    v0Var2.remove(i12);
                }
                throw new NullPointerException(str);
            }
            v0Var2.add(obj);
        }
    }

    public static e m() {
        return DEFAULT_INSTANCE;
    }

    public static d o() {
        return (d) ((u) DEFAULT_INSTANCE.c(5));
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final Object c(int i10) {
        s0 vVar;
        switch (y3.e.b(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new w0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new e();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                s0 s0Var = PARSER;
                if (s0Var != null) {
                    return s0Var;
                }
                synchronized (e.class) {
                    try {
                        vVar = PARSER;
                        if (vVar == null) {
                            vVar = new v();
                            PARSER = vVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return vVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final x n() {
        return this.strings_;
    }
}
