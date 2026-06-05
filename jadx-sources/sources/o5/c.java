package o5;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.d1;
import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.o;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w0;
import androidx.datastore.preferences.protobuf.x0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends w {
    private static final c DEFAULT_INSTANCE;
    private static volatile s0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private j0 preferences_ = j0.f950b;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        w.j(c.class, cVar);
    }

    public static j0 l(c cVar) {
        j0 j0Var = cVar.preferences_;
        if (!j0Var.f951a) {
            cVar.preferences_ = j0Var.b();
        }
        return cVar.preferences_;
    }

    public static a n() {
        return (a) ((u) DEFAULT_INSTANCE.c(5));
    }

    public static c o(FileInputStream fileInputStream) throws a0 {
        c cVar = DEFAULT_INSTANCE;
        i iVar = new i(fileInputStream);
        o oVarA = o.a();
        w wVarI = cVar.i();
        try {
            u0 u0Var = u0.f1025c;
            u0Var.getClass();
            x0 x0VarA = u0Var.a(wVarI.getClass());
            k kVar = (k) iVar.f949b;
            if (kVar == null) {
                kVar = new k(iVar);
            }
            x0VarA.i(wVarI, kVar, oVarA);
            x0VarA.b(wVarI);
            if (w.f(wVarI, true)) {
                return (c) wVarI;
            }
            throw new a0(new d1().getMessage());
        } catch (a0 e10) {
            if (e10.f891a) {
                throw new a0(e10.getMessage(), e10);
            }
            throw e10;
        } catch (d1 e11) {
            throw new a0(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof a0) {
                throw ((a0) e12.getCause());
            }
            throw new a0(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof a0) {
                throw ((a0) e13.getCause());
            }
            throw e13;
        }
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
                return new w0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f12420a});
            case 3:
                return new c();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                s0 s0Var = PARSER;
                if (s0Var != null) {
                    return s0Var;
                }
                synchronized (c.class) {
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

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
