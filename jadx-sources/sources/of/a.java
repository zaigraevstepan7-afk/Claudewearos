package of;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import t.m1;
import zf.b0;
import zf.j0;
import zf.l1;
import zf.o1;
import zf.r1;
import zf.t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a {
    static {
        f[] fVarArr = {new f(nf.a.class, 0)};
        HashMap map = new HashMap();
        f fVar = fVarArr[0];
        Class cls = fVar.f12453a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(m1.h(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, fVar);
        Class cls2 = fVarArr[0].f12453a;
        Collections.unmodifiableMap(map);
        f[] fVarArr2 = {new f(nf.a.class, 3)};
        HashMap map2 = new HashMap();
        f fVar2 = fVarArr2[0];
        Class cls3 = fVar2.f12453a;
        if (map2.containsKey(cls3)) {
            throw new IllegalArgumentException(m1.h(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map2.put(cls3, fVar2);
        Class cls4 = fVarArr2[0].f12453a;
        Collections.unmodifiableMap(map2);
        f[] fVarArr3 = {new f(nf.a.class, 4)};
        HashMap map3 = new HashMap();
        f fVar3 = fVarArr3[0];
        Class cls5 = fVar3.f12453a;
        if (map3.containsKey(cls5)) {
            throw new IllegalArgumentException(m1.h(cls5, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map3.put(cls5, fVar3);
        Class cls6 = fVarArr3[0].f12453a;
        Collections.unmodifiableMap(map3);
        f[] fVarArr4 = {new f(nf.a.class, 2)};
        HashMap map4 = new HashMap();
        f fVar4 = fVarArr4[0];
        Class cls7 = fVar4.f12453a;
        if (map4.containsKey(cls7)) {
            throw new IllegalArgumentException(m1.h(cls7, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map4.put(cls7, fVar4);
        Class cls8 = fVarArr4[0].f12453a;
        Collections.unmodifiableMap(map4);
        f[] fVarArr5 = {new f(nf.a.class, 6)};
        HashMap map5 = new HashMap();
        f fVar5 = fVarArr5[0];
        Class cls9 = fVar5.f12453a;
        if (map5.containsKey(cls9)) {
            throw new IllegalArgumentException(m1.h(cls9, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map5.put(cls9, fVar5);
        Class cls10 = fVarArr5[0].f12453a;
        Collections.unmodifiableMap(map5);
        f[] fVarArr6 = {new f(nf.a.class, 7)};
        HashMap map6 = new HashMap();
        f fVar6 = fVarArr6[0];
        Class cls11 = fVar6.f12453a;
        if (map6.containsKey(cls11)) {
            throw new IllegalArgumentException(m1.h(cls11, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map6.put(cls11, fVar6);
        Class cls12 = fVarArr6[0].f12453a;
        Collections.unmodifiableMap(map6);
        f[] fVarArr7 = {new f(nf.a.class, 5)};
        HashMap map7 = new HashMap();
        f fVar7 = fVarArr7[0];
        Class cls13 = fVar7.f12453a;
        if (map7.containsKey(cls13)) {
            throw new IllegalArgumentException(m1.h(cls13, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map7.put(cls13, fVar7);
        Class cls14 = fVarArr7[0].f12453a;
        Collections.unmodifiableMap(map7);
        f[] fVarArr8 = {new f(nf.a.class, 8)};
        HashMap map8 = new HashMap();
        f fVar8 = fVarArr8[0];
        Class cls15 = fVar8.f12453a;
        if (map8.containsKey(cls15)) {
            throw new IllegalArgumentException(m1.h(cls15, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map8.put(cls15, fVar8);
        Class cls16 = fVarArr8[0].f12453a;
        Collections.unmodifiableMap(map8);
        int i10 = r1.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws NoSuchPaddingException, NoSuchAlgorithmException {
        nf.n.h(e.f12452b);
        vf.m.a();
        Class<zf.h> cls = zf.h.class;
        h hVar = new h(cls, new f[]{new f(nf.a.class, 0)}, 0);
        int i10 = 1;
        nf.n.f(hVar, true);
        int i11 = 3;
        nf.n.f(new h(zf.x.class, new f[]{new f(nf.a.class, 3)}, 2), true);
        uf.k kVar = o.f12485a;
        uf.i iVar = uf.i.f17042b;
        iVar.e(o.f12485a);
        iVar.d(o.f12486b);
        iVar.c(o.f12487c);
        iVar.b(o.f12488d);
        if (rf.a.a()) {
            return;
        }
        nf.n.f(new h(zf.r.class, new f[]{new f(nf.a.class, 2)}, i10), true);
        iVar.e(l.f12477a);
        iVar.d(l.f12478b);
        iVar.c(l.f12479c);
        iVar.b(l.f12480d);
        int i12 = 4;
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            nf.n.f(new h(b0.class, new f[]{new f(nf.a.class, 4)}, i11), true);
            iVar.e(r.f12491a);
            iVar.d(r.f12492b);
            iVar.c(r.f12493c);
            iVar.b(r.f12494d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        nf.n.f(new h(j0.class, new f[]{new f(nf.a.class, 5)}, i12), true);
        uf.k kVar2 = u.f12495a;
        uf.i iVar2 = uf.i.f17042b;
        iVar2.e(u.f12495a);
        iVar2.d(u.f12496b);
        iVar2.c(u.f12497c);
        iVar2.b(u.f12498d);
        Class<l1> cls2 = l1.class;
        nf.n.f(new h(cls2, new f[]{new f(nf.a.class, 6)}, 5), true);
        Class<o1> cls3 = o1.class;
        nf.n.f(new h(cls3, new f[]{new f(nf.a.class, 7)}, 6), true);
        Class<t1> cls4 = t1.class;
        nf.n.f(new h(cls4, new f[]{new f(nf.a.class, 8)}, 7), true);
        iVar2.e(y.f12502a);
        iVar2.d(y.f12503b);
        iVar2.c(y.f12504c);
        iVar2.b(y.f12505d);
    }
}
