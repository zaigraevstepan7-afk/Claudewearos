package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f998c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f999a = z0.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f1000b;

    static {
        new r(0);
    }

    public r() {
    }

    public static void b(m mVar, s1 s1Var, int i10, Object obj) {
        if (s1Var == s1.f1009d) {
            mVar.v0(i10, 3);
            ((a) obj).b(mVar);
            mVar.v0(i10, 4);
        }
        mVar.v0(i10, s1Var.f1013b);
        switch (s1Var.ordinal()) {
            case 0:
                mVar.p0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                mVar.n0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                mVar.z0(((Long) obj).longValue());
                break;
            case 3:
                mVar.z0(((Long) obj).longValue());
                break;
            case 4:
                mVar.r0(((Integer) obj).intValue());
                break;
            case 5:
                mVar.p0(((Long) obj).longValue());
                break;
            case 6:
                mVar.n0(((Integer) obj).intValue());
                break;
            case 7:
                mVar.h0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof g)) {
                    mVar.u0((String) obj);
                    break;
                } else {
                    mVar.l0((g) obj);
                    break;
                }
            case 9:
                ((a) obj).b(mVar);
                break;
            case 10:
                a aVar = (a) obj;
                mVar.getClass();
                mVar.x0(((w) aVar).a(null));
                aVar.b(mVar);
                break;
            case 11:
                if (!(obj instanceof g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    mVar.x0(length);
                    mVar.i0(bArr, 0, length);
                    break;
                } else {
                    mVar.l0((g) obj);
                    break;
                }
            case 12:
                mVar.x0(((Integer) obj).intValue());
                break;
            case 13:
                mVar.r0(((Integer) obj).intValue());
                break;
            case 14:
                mVar.n0(((Integer) obj).intValue());
                break;
            case 15:
                mVar.p0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                mVar.x0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                mVar.z0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f1000b) {
            return;
        }
        z0 z0Var = this.f999a;
        int size = z0Var.f1041a.size();
        for (int i10 = 0; i10 < size; i10++) {
            Map.Entry entryC = z0Var.c(i10);
            if (entryC.getValue() instanceof w) {
                w wVar = (w) entryC.getValue();
                wVar.getClass();
                u0 u0Var = u0.f1025c;
                u0Var.getClass();
                u0Var.a(wVar.getClass()).b(wVar);
                wVar.h();
            }
        }
        if (!z0Var.f1043c) {
            if (z0Var.f1041a.size() > 0) {
                z0Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = z0Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!z0Var.f1043c) {
            z0Var.f1042b = z0Var.f1042b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(z0Var.f1042b);
            z0Var.f1045e = z0Var.f1045e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(z0Var.f1045e);
            z0Var.f1043c = true;
        }
        this.f1000b = true;
    }

    public final Object clone() {
        r rVar = new r();
        z0 z0Var = this.f999a;
        if (z0Var.f1041a.size() > 0) {
            Map.Entry entryC = z0Var.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = z0Var.d().iterator();
        if (!it.hasNext()) {
            return rVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f999a.equals(((r) obj).f999a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f999a.hashCode();
    }

    public r(int i10) {
        a();
        a();
    }
}
