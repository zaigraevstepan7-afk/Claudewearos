package of;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import t.m1;
import zf.b0;
import zf.f0;
import zf.j0;
import zf.l1;
import zf.o0;
import zf.o1;
import zf.q0;
import zf.t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Class f12453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12454b;

    public f(Class cls, int i10) {
        this.f12454b = i10;
        this.f12453a = cls;
    }

    public final Object a(com.google.crypto.tink.shaded.protobuf.a aVar) throws GeneralSecurityException {
        switch (this.f12454b) {
            case 0:
                zf.h hVar = (zf.h) aVar;
                f[] fVarArr = {new f(ag.m.class, 1)};
                HashMap map = new HashMap();
                for (f fVar : fVarArr) {
                    Class cls = fVar.f12453a;
                    if (map.containsKey(cls)) {
                        throw new IllegalArgumentException(m1.h(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map.put(cls, fVar);
                }
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f12453a;
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                zf.l lVarZ = hVar.z();
                f fVar2 = (f) mapUnmodifiableMap.get(ag.m.class);
                if (fVar2 == null) {
                    throw new IllegalArgumentException("Requested primitive class " + ag.m.class.getCanonicalName() + " not supported.");
                }
                ag.m mVar = (ag.m) fVar2.a(lVarZ);
                f[] fVarArr2 = {new f(nf.j.class, 11)};
                HashMap map2 = new HashMap();
                for (f fVar3 : fVarArr2) {
                    Class cls3 = fVar3.f12453a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException(m1.h(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map2.put(cls3, fVar3);
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f12453a;
                }
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
                q0 q0VarA = hVar.A();
                f fVar4 = (f) mapUnmodifiableMap2.get(nf.j.class);
                if (fVar4 != null) {
                    return new ag.h(mVar, (nf.j) fVar4.a(q0VarA), hVar.A().B().A());
                }
                throw new IllegalArgumentException("Requested primitive class " + nf.j.class.getCanonicalName() + " not supported.");
            case 1:
                zf.l lVar = (zf.l) aVar;
                return new ag.b(lVar.A().x(), lVar.B().y());
            case 2:
                zf.r rVar = (zf.r) aVar;
                return new ag.c(rVar.z().x(), rVar.A().y());
            case 3:
                return new ag.d(((zf.x) aVar).y().x(), 0);
            case 4:
                return new qf.a(((b0) aVar).y().x());
            case 5:
                return new ag.d(((j0) aVar).y().x(), 1);
            case 6:
                String strX = ((l1) aVar).y().x();
                return nf.i.a(strX).c(strX);
            case 7:
                o1 o1Var = (o1) aVar;
                String strY = o1Var.y().y();
                return new v(o1Var.y().x(), nf.i.a(strY).c(strY));
            case 8:
                return new ag.d(((t1) aVar).y().x(), 2);
            case 9:
                return new ag.e(((f0) aVar).y().x());
            case 10:
                zf.b bVar = (zf.b) aVar;
                return new ag.o(new ac.d(bVar.z().x()), bVar.A().y());
            default:
                q0 q0Var = (q0) aVar;
                o0 o0VarZ = q0Var.B().z();
                SecretKeySpec secretKeySpec = new SecretKeySpec(q0Var.A().x(), "HMAC");
                int iA = q0Var.B().A();
                int iOrdinal = o0VarZ.ordinal();
                if (iOrdinal == 1) {
                    return new ag.o(new md.m("HMACSHA1", secretKeySpec), iA);
                }
                if (iOrdinal == 2) {
                    return new ag.o(new md.m("HMACSHA384", secretKeySpec), iA);
                }
                if (iOrdinal == 3) {
                    return new ag.o(new md.m("HMACSHA256", secretKeySpec), iA);
                }
                if (iOrdinal == 4) {
                    return new ag.o(new md.m("HMACSHA512", secretKeySpec), iA);
                }
                if (iOrdinal == 5) {
                    return new ag.o(new md.m("HMACSHA224", secretKeySpec), iA);
                }
                throw new GeneralSecurityException("unknown hash");
        }
    }
}
