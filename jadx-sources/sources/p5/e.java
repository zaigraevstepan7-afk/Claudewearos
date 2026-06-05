package p5;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y;
import fj.l;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import m5.r0;
import o5.f;
import o5.g;
import qi.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f12801a = new e();

    public a a(FileInputStream fileInputStream) throws m5.b {
        byte[] bArr;
        try {
            o5.c cVarO = o5.c.o(fileInputStream);
            a aVar = new a(false);
            c[] cVarArr = (c[]) Arrays.copyOf(new c[0], 0);
            l.f(cVarArr, "pairs");
            aVar.b();
            if (cVarArr.length > 0) {
                c cVar = cVarArr[0];
                throw null;
            }
            Map mapM = cVarO.m();
            l.e(mapM, "getPreferencesMap(...)");
            for (Map.Entry entry : mapM.entrySet()) {
                String str = (String) entry.getKey();
                g gVar = (g) entry.getValue();
                l.c(str);
                l.c(gVar);
                int iC = gVar.C();
                switch (iC == 0 ? -1 : d.f12800a[y3.e.b(iC)]) {
                    case -1:
                        throw new m5.b("Value case is null.", null);
                    case 0:
                    default:
                        throw new b3.e();
                    case 1:
                        aVar.c(new b(str), Boolean.valueOf(gVar.t()));
                        break;
                    case 2:
                        aVar.c(new b(str), Float.valueOf(gVar.x()));
                        break;
                    case 3:
                        aVar.c(new b(str), Double.valueOf(gVar.w()));
                        break;
                    case 4:
                        aVar.c(new b(str), Integer.valueOf(gVar.y()));
                        break;
                    case 5:
                        aVar.c(new b(str), Long.valueOf(gVar.z()));
                        break;
                    case 6:
                        aVar.c(new b(str), gVar.A());
                        break;
                    case 7:
                        b bVar = new b(str);
                        x xVarN = gVar.B().n();
                        l.e(xVarN, "getStringsList(...)");
                        aVar.c(bVar, qi.l.V0(xVarN));
                        break;
                    case 8:
                        b bVar2 = new b(str);
                        androidx.datastore.preferences.protobuf.g gVarU = gVar.u();
                        int size = gVarU.size();
                        if (size == 0) {
                            bArr = y.f1036b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            gVarU.w(size, bArr2);
                            bArr = bArr2;
                        }
                        aVar.c(bVar2, bArr);
                        break;
                    case 9:
                        throw new m5.b("Value not set.", null);
                }
            }
            return new a(v.n0(aVar.a()), true);
        } catch (a0 e10) {
            throw new m5.b("Unable to parse preferences proto.", e10);
        }
    }

    public void b(Object obj, r0 r0Var) throws IOException {
        w wVarA;
        Map mapA = ((a) obj).a();
        o5.a aVarN = o5.c.n();
        for (Map.Entry entry : mapA.entrySet()) {
            b bVar = (b) entry.getKey();
            Object value = entry.getValue();
            String str = bVar.f12799a;
            if (value instanceof Boolean) {
                f fVarD = g.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                fVarD.c();
                g.q((g) fVarD.f1024b, zBooleanValue);
                wVarA = fVarD.a();
            } else if (value instanceof Float) {
                f fVarD2 = g.D();
                float fFloatValue = ((Number) value).floatValue();
                fVarD2.c();
                g.r((g) fVarD2.f1024b, fFloatValue);
                wVarA = fVarD2.a();
            } else if (value instanceof Double) {
                f fVarD3 = g.D();
                double dDoubleValue = ((Number) value).doubleValue();
                fVarD3.c();
                g.o((g) fVarD3.f1024b, dDoubleValue);
                wVarA = fVarD3.a();
            } else if (value instanceof Integer) {
                f fVarD4 = g.D();
                int iIntValue = ((Number) value).intValue();
                fVarD4.c();
                g.s((g) fVarD4.f1024b, iIntValue);
                wVarA = fVarD4.a();
            } else if (value instanceof Long) {
                f fVarD5 = g.D();
                long jLongValue = ((Number) value).longValue();
                fVarD5.c();
                g.l((g) fVarD5.f1024b, jLongValue);
                wVarA = fVarD5.a();
            } else if (value instanceof String) {
                f fVarD6 = g.D();
                fVarD6.c();
                g.m((g) fVarD6.f1024b, (String) value);
                wVarA = fVarD6.a();
            } else if (value instanceof Set) {
                f fVarD7 = g.D();
                o5.d dVarO = o5.e.o();
                dVarO.c();
                o5.e.l((o5.e) dVarO.f1024b, (Set) value);
                fVarD7.c();
                g.n((g) fVarD7.f1024b, (o5.e) dVarO.a());
                wVarA = fVarD7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                f fVarD8 = g.D();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.g gVarI = androidx.datastore.preferences.protobuf.g.i(0, bArr, bArr.length);
                fVarD8.c();
                g.p((g) fVarD8.f1024b, gVarI);
                wVarA = fVarD8.a();
            }
            aVarN.getClass();
            aVarN.c();
            o5.c.l((o5.c) aVarN.f1024b).put(str, (g) wVarA);
        }
        o5.c cVar = (o5.c) aVarN.a();
        int iA = cVar.a(null);
        Logger logger = m.f968i;
        if (iA > 4096) {
            iA = 4096;
        }
        m mVar = new m(r0Var, iA);
        cVar.b(mVar);
        if (mVar.f972g > 0) {
            mVar.f0();
        }
    }
}
