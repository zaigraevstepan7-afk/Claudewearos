package cg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c2.p;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzfrv;
import com.google.android.gms.internal.ads.zzfrw;
import com.google.android.gms.internal.ads.zzfrx;
import com.google.android.gms.internal.ads.zzfup;
import com.google.android.gms.internal.ads.zzfvt;
import f1.a1;
import f1.i0;
import f1.s;
import f1.t1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q.g0;
import qc.l0;
import qi.u;
import qi.v;
import rg.f0;
import rg.z;
import t.m1;
import t6.e0;
import t6.q0;
import v2.i1;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static i2.f f3356a = null;

    /* renamed from: b, reason: collision with root package name */
    public static i2.f f3357b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f3358c = true;

    public static c2.j A(long j, float f10) {
        c2.j jVarA = c2.l.a();
        jVarA.k();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        ga.a aVar = ga.a.f7254l;
        double d10 = fIntBitsToFloat;
        double d11 = fIntBitsToFloat2;
        double d12 = f10;
        float f11 = ((fIntBitsToFloat * 0.5f) - f10) / f10;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        float f12 = ((fIntBitsToFloat2 * 0.5f) - f10) / f10;
        double[] dArrC = aVar.c(f11, (f12 >= 0.0f ? f12 : 0.0f) <= 1.0f ? r12 : 1.0f);
        if (dArrC.length < 20) {
            return jVarA;
        }
        double d13 = d10 - d12;
        jVarA.h((float) ((dArrC[0] * d12) + d13), (float) ((dArrC[1] * d12) + 0.0d));
        jVarA.e((float) ((dArrC[2] * d12) + d13), (float) ((dArrC[3] * d12) + 0.0d), (float) ((dArrC[4] * d12) + d13), (float) ((dArrC[5] * d12) + 0.0d), (float) ((dArrC[6] * d12) + d13), (float) ((dArrC[7] * d12) + 0.0d));
        jVarA.e((float) ((dArrC[8] * d12) + d13), (float) ((dArrC[9] * d12) + 0.0d), (float) ((dArrC[10] * d12) + d13), (float) ((dArrC[11] * d12) + 0.0d), (float) ((dArrC[12] * d12) + d13), (float) ((dArrC[13] * d12) + 0.0d));
        jVarA.e((float) ((dArrC[14] * d12) + d13), (float) ((dArrC[15] * d12) + 0.0d), (float) ((dArrC[16] * d12) + d13), (float) ((dArrC[17] * d12) + 0.0d), (float) ((dArrC[18] * d12) + d13), (float) ((dArrC[19] * d12) + 0.0d));
        jVarA.g((float) ((dArrC[18] * d12) + d13), (float) (d11 - (dArrC[19] * d12)));
        jVarA.e((float) ((dArrC[16] * d12) + d13), (float) (d11 - (dArrC[17] * d12)), (float) ((dArrC[14] * d12) + d13), (float) (d11 - (dArrC[15] * d12)), (float) ((dArrC[12] * d12) + d13), (float) (d11 - (dArrC[13] * d12)));
        jVarA.e((float) ((dArrC[10] * d12) + d13), (float) (d11 - (dArrC[11] * d12)), (float) ((dArrC[8] * d12) + d13), (float) (d11 - (dArrC[9] * d12)), (float) ((dArrC[6] * d12) + d13), (float) (d11 - (dArrC[7] * d12)));
        jVarA.e((float) ((dArrC[4] * d12) + d13), (float) (d11 - (dArrC[5] * d12)), (float) ((dArrC[2] * d12) + d13), (float) (d11 - (dArrC[3] * d12)), (float) ((dArrC[0] * d12) + d13), (float) (d11 - (dArrC[1] * d12)));
        jVarA.g((float) (d12 - (dArrC[0] * d12)), (float) (d11 - (dArrC[1] * d12)));
        jVarA.e((float) (d12 - (dArrC[2] * d12)), (float) (d11 - (dArrC[3] * d12)), (float) (d12 - (dArrC[4] * d12)), (float) (d11 - (dArrC[5] * d12)), (float) (d12 - (dArrC[6] * d12)), (float) (d11 - (dArrC[7] * d12)));
        jVarA.e((float) (d12 - (dArrC[8] * d12)), (float) (d11 - (dArrC[9] * d12)), (float) (d12 - (dArrC[10] * d12)), (float) (d11 - (dArrC[11] * d12)), (float) (d12 - (dArrC[12] * d12)), (float) (d11 - (dArrC[13] * d12)));
        jVarA.e((float) (d12 - (dArrC[14] * d12)), (float) (d11 - (dArrC[15] * d12)), (float) (d12 - (dArrC[16] * d12)), (float) (d11 - (dArrC[17] * d12)), (float) (d12 - (dArrC[18] * d12)), (float) (d11 - (dArrC[19] * d12)));
        jVarA.g((float) (d12 - (dArrC[18] * d12)), (float) ((dArrC[19] * d12) + 0.0d));
        jVarA.e((float) (d12 - (dArrC[16] * d12)), (float) ((dArrC[17] * d12) + 0.0d), (float) (d12 - (dArrC[14] * d12)), (float) ((dArrC[15] * d12) + 0.0d), (float) (d12 - (dArrC[12] * d12)), (float) ((dArrC[13] * d12) + 0.0d));
        jVarA.e((float) (d12 - (dArrC[10] * d12)), (float) ((dArrC[11] * d12) + 0.0d), (float) (d12 - (dArrC[8] * d12)), (float) ((dArrC[9] * d12) + 0.0d), (float) (d12 - (dArrC[6] * d12)), (float) ((dArrC[7] * d12) + 0.0d));
        jVarA.e((float) (d12 - (dArrC[4] * d12)), (float) ((dArrC[5] * d12) + 0.0d), (float) (d12 - (dArrC[2] * d12)), (float) ((dArrC[3] * d12) + 0.0d), (float) (d12 - (dArrC[0] * d12)), (float) ((dArrC[1] * d12) + 0.0d));
        jVarA.d();
        return jVarA;
    }

    public static a.a B(int i10) {
        return i10 != 0 ? i10 != 1 ? new ef.k() : new ef.e() : new ef.k();
    }

    public static HashMap C(ug.a aVar) {
        HashMap map = new HashMap();
        map.put("timestamp", Long.valueOf(aVar.millis()));
        return map;
    }

    public static final Class D(lj.b bVar) {
        fj.l.f(bVar, "<this>");
        Class clsA = ((fj.e) bVar).a();
        fj.l.d(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class E(lj.b bVar) {
        fj.l.f(bVar, "<this>");
        Class clsA = ((fj.e) bVar).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static final long F(long j) {
        if (j < 0) {
            oj.f fVar = oj.a.f12531b;
            return oj.a.f12533d;
        }
        oj.f fVar2 = oj.a.f12531b;
        return oj.a.f12532c;
    }

    public static long G(int i10, byte[] bArr) {
        return (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16)) & 4294967295L;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object H(java.lang.Object r7, hj.a r8, java.util.HashMap r9) {
        /*
            boolean r0 = r7 instanceof java.util.Map
            if (r0 != 0) goto L5
            return r7
        L5:
            r0 = r7
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = ".sv"
            boolean r2 = r0.containsKey(r1)
            if (r2 != 0) goto L12
            goto L9b
        L12:
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L30
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r8 = "timestamp"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L99
            boolean r8 = r9.containsKey(r0)
            if (r8 == 0) goto L99
            java.lang.Object r2 = r9.get(r0)
            goto L99
        L30:
            boolean r9 = r0 instanceof java.util.Map
            if (r9 == 0) goto L99
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r9 = "increment"
            boolean r1 = r0.containsKey(r9)
            if (r1 != 0) goto L3f
            goto L99
        L3f:
            java.lang.Object r9 = r0.get(r9)
            boolean r0 = r9 instanceof java.lang.Number
            if (r0 != 0) goto L48
            goto L99
        L48:
            r2 = r9
            java.lang.Number r2 = (java.lang.Number) r2
            zg.r r8 = r8.C()
            boolean r9 = r8.n()
            if (r9 == 0) goto L99
            java.lang.Object r9 = r8.getValue()
            boolean r9 = r9 instanceof java.lang.Number
            if (r9 != 0) goto L5e
            goto L99
        L5e:
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            boolean r9 = r2 instanceof java.lang.Double
            if (r9 != 0) goto L8c
            boolean r9 = r2 instanceof java.lang.Float
            if (r9 != 0) goto L8c
            boolean r9 = r8 instanceof java.lang.Double
            if (r9 != 0) goto L8c
            boolean r9 = r8 instanceof java.lang.Float
            if (r9 != 0) goto L8c
            long r0 = r2.longValue()
            long r3 = r8.longValue()
            long r5 = r0 + r3
            long r0 = r0 ^ r5
            long r3 = r3 ^ r5
            long r0 = r0 & r3
            r3 = 0
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 < 0) goto L8c
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            goto L99
        L8c:
            double r0 = r2.doubleValue()
            double r8 = r8.doubleValue()
            double r8 = r8 + r0
            java.lang.Double r2 = java.lang.Double.valueOf(r8)
        L99:
            if (r2 != 0) goto L9c
        L9b:
            return r7
        L9c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.b.H(java.lang.Object, hj.a, java.util.HashMap):java.lang.Object");
    }

    public static rg.b I(rg.b bVar, z zVar, rg.h hVar, HashMap map) {
        rg.b bVarB = rg.b.f14382b;
        Iterator it = bVar.f14383a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            bVarB = bVarB.b((rg.h) entry.getKey(), J((r) entry.getValue(), new f0(zVar, hVar.e((rg.h) entry.getKey())), map));
        }
        return bVarB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r4 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static zg.r J(zg.r r6, hj.a r7, java.util.HashMap r8) {
        /*
            zg.r r0 = r6.c()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = ".priority"
            zg.c r1 = zg.c.b(r1)
            hj.a r1 = r7.v(r1)
            java.lang.Object r1 = H(r0, r1, r8)
            boolean r2 = r6.n()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L48
            java.lang.Object r2 = r6.getValue()
            java.lang.Object r7 = H(r2, r7, r8)
            java.lang.Object r8 = r6.getValue()
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L3f
            if (r1 != r0) goto L34
            r4 = 1
            goto L3d
        L34:
            if (r1 == 0) goto L3d
            if (r0 != 0) goto L39
            goto L3d
        L39:
            boolean r4 = r1.equals(r0)
        L3d:
            if (r4 != 0) goto L4e
        L3f:
            zg.r r6 = u0.l.m(r3, r1)
            zg.r r6 = u0.c.b(r7, r6)
            return r6
        L48:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L4f
        L4e:
            return r6
        L4f:
            zg.f r6 = (zg.f) r6
            yh.c r0 = new yh.c
            r2 = 16
            r5 = 0
            r0.<init>(r2, r5)
            r0.f20314b = r6
            rg.n r2 = new rg.n
            r2.<init>(r7, r8, r0)
            r6.e(r2, r4)
            java.lang.Object r6 = r0.f20314b
            zg.r r6 = (zg.r) r6
            zg.r r6 = r6.c()
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L7e
            java.lang.Object r6 = r0.f20314b
            zg.r r6 = (zg.r) r6
            zg.r r7 = u0.l.m(r3, r1)
            zg.r r6 = r6.m(r7)
            return r6
        L7e:
            java.lang.Object r6 = r0.f20314b
            zg.r r6 = (zg.r) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.b.J(zg.r, hj.a, java.util.HashMap):zg.r");
    }

    public static final long K(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final long L(long j, long j4, oj.c cVar) {
        long j10 = j - j4;
        if (((j10 ^ j) & (~(j10 ^ j4))) >= 0) {
            return yd.f.k0(j10, cVar);
        }
        oj.c cVar2 = oj.c.f12538d;
        if (cVar.compareTo(cVar2) >= 0) {
            return oj.a.r(F(j10));
        }
        long jK = a.a.k(1L, cVar2, cVar);
        long j11 = (j / jK) - (j4 / jK);
        long j12 = (j % jK) - (j4 % jK);
        oj.f fVar = oj.a.f12531b;
        return oj.a.o(yd.f.k0(j11, cVar2), yd.f.k0(j12, cVar));
    }

    public static Set M(Object... objArr) {
        fj.l.f(objArr, "elements");
        int length = objArr.length;
        if (length == 0) {
            return u.f13522a;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            fj.l.e(setSingleton, "singleton(...)");
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(v.g0(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static void N(View view, ef.i iVar) {
        ye.a aVar = iVar.f6000b.f5984c;
        if (aVar == null || !aVar.f20303a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        ef.g gVar = iVar.f6000b;
        if (gVar.f5993m != elevation) {
            gVar.f5993m = elevation;
            iVar.s();
        }
    }

    public static kj.f O(kj.h hVar) {
        fj.l.f(hVar, "<this>");
        return new kj.f(hVar.f9665a, hVar.f9666b, hVar.f9667c > 0 ? 2 : -2);
    }

    public static void P(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            k7.a.l(viewGroup, z2);
        } else if (f3358c) {
            try {
                k7.a.l(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f3358c = false;
            }
        }
    }

    public static void Q(byte[] bArr, long j, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j);
            i11++;
            j >>= 8;
        }
    }

    public static final long R(long j) {
        return (((int) Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final long S(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static kj.h T(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new kj.h(i10, i11 - 1, 1);
        }
        kj.h hVar = kj.h.f9672d;
        return kj.h.f9672d;
    }

    public static final void U(d3.r rVar, int i10, c3.i iVar) {
        d3.r rVar2;
        g1.e eVar = new g1.e(new d3.r[16]);
        List listI = rVar.i(false, false);
        while (true) {
            eVar.d(eVar.f7026c, listI);
            while (true) {
                int i11 = eVar.f7026c;
                if (i11 == 0) {
                    return;
                }
                rVar2 = (d3.r) eVar.l(i11 - 1);
                boolean zG = d3.u.g(rVar2);
                d3.n nVar = rVar2.f4766d;
                g0 g0Var = nVar.f4758a;
                if (!zG && !g0Var.c(d3.v.j)) {
                    i1 i1VarD = rVar2.d();
                    if (i1VarD == null) {
                        throw m1.e("Expected semantics node to have a coordinator.");
                    }
                    s3.k kVarS = a.a.S(t2.z.f(i1VarD, true));
                    if (kVarS.f14747a < kVarS.f14749c && kVarS.f14748b < kVarS.f14750d) {
                        Object objG = nVar.f4758a.g(d3.m.f4737e);
                        if (objG == null) {
                            objG = null;
                        }
                        ej.e eVar2 = (ej.e) objG;
                        Object objG2 = g0Var.g(d3.v.f4797w);
                        d3.k kVar = (d3.k) (objG2 != null ? objG2 : null);
                        if (eVar2 == null || kVar == null || ((Number) kVar.f4725b.a()).floatValue() <= 0.0f) {
                            break;
                        }
                        int i12 = 1 + i10;
                        iVar.invoke(new c3.j(rVar2, i12, kVarS, i1VarD));
                        U(rVar2, i12, iVar);
                    }
                }
            }
            listI = rVar2.i(false, false);
        }
    }

    public static final void V(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (i10 < 0 || byteBuffer2.remaining() < i10 || byteBuffer3.remaining() < i10 || byteBuffer.remaining() < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] W(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (i12 < 0 || bArr.length - i12 < i10 || bArr2.length - i12 < i11) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr3[i13] = (byte) (bArr[i13 + i10] ^ bArr2[i13 + i11]);
        }
        return bArr3;
    }

    public static final byte[] X(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return W(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static Bundle Y(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e10) {
                int i10 = l0.f13401b;
                rc.k.c("JSON parsing error", e10);
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            int i12 = iOptInt != 0 ? iOptInt != 1 ? iOptInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i12 != 0) {
                List listZzf = zzfvt.zzb(zzfup.zzc('/')).zzf(strOptString2);
                if (listZzf.size() > 2 || listZzf.isEmpty()) {
                    obj = null;
                } else {
                    if (listZzf.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listZzf.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listZzf.get(0), 0);
                        str2 = (String) listZzf.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i13 = i12 - 1;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static void Z(Context context) throws IOException {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgq)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzfrv zzfrvVarZzj = zzfrv.zzj(context);
            zzfrw zzfrwVarZzi = zzfrw.zzi(context);
            zzfrx zzfrxVarZza = zzfrx.zza(context);
            zzfrvVarZzj.zzk();
            zzfrvVarZzj.zzl();
            zzfrwVarZzi.zzj();
            zzfrxVarZza.zzb(null);
        } catch (IOException e10) {
            mc.n.D.f11582h.zzw(e10, "clearStorageOnIdlessMode");
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e11) {
            mc.n.D.f11582h.zzw(e11, "clearStorageOnIdlessMode_scar");
        }
    }

    public static final void a(Boolean bool, Object obj, androidx.lifecycle.t tVar, ej.c cVar, i0 i0Var, int i10) {
        int i11;
        i0Var.c0(696924721);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.h(bool) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | (i0Var.h(obj) ? 32 : 16) | 128 | (i0Var.h(cVar) ? 2048 : 1024);
        if (i0Var.T(i12 & 1, (i12 & 1171) != 1170)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                tVar = (androidx.lifecycle.t) i0Var.j(b6.k.f1609a);
            } else {
                i0Var.W();
            }
            int i13 = i12 & (-897);
            i0Var.q();
            boolean zF = i0Var.f(bool) | i0Var.f(obj) | i0Var.f(tVar);
            Object objQ = i0Var.Q();
            if (zF || objQ == f1.m.f6385a) {
                objQ = new b6.i(tVar.h());
                i0Var.l0(objQ);
            }
            b(tVar, (b6.i) objQ, cVar, i0Var, (i13 >> 3) & 896);
        } else {
            i0Var.W();
        }
        androidx.lifecycle.t tVar2 = tVar;
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.d(bool, obj, tVar2, cVar, i10, 0);
        }
    }

    public static final void b(androidx.lifecycle.t tVar, b6.i iVar, ej.c cVar, i0 i0Var, int i10) {
        int i11;
        i0Var.c0(228371534);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.h(tVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(iVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(cVar) ? 256 : 128;
        }
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            boolean zH = i0Var.h(iVar) | ((i11 & 896) == 256) | i0Var.h(tVar);
            Object objQ = i0Var.Q();
            if (zH || objQ == f1.m.f6385a) {
                objQ = new ab.m(tVar, iVar, cVar, 1);
                i0Var.l0(objQ);
            }
            s.d(tVar, iVar, (ej.c) objQ, i0Var);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.e(tVar, iVar, cVar, i10, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x089d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final v1.o r57, final boolean r58, final boolean r59, final float r60, final java.util.List r61, java.lang.String r62, final boolean r63, final java.util.Map r64, final java.util.List r65, final java.lang.String r66, final float r67, final boolean r68, ej.c r69, final ej.e r70, final ej.c r71, final ej.c r72, final ej.c r73, final ej.a r74, final ej.c r75, final ej.c r76, final ej.c r77, final mi.p r78, final p1.e r79, f1.i0 r80, final int r81) {
        /*
            Method dump skipped, instructions count: 2292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.b.c(v1.o, boolean, boolean, float, java.util.List, java.lang.String, boolean, java.util.Map, java.util.List, java.lang.String, float, boolean, ej.c, ej.e, ej.c, ej.c, ej.c, ej.a, ej.c, ej.c, ej.c, mi.p, p1.e, f1.i0, int):void");
    }

    public static Object d(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final void e(a1 a1Var, boolean z2) {
        a1Var.setValue(Boolean.valueOf(z2));
    }

    public static final double f(double d10, double d11, double d12, double d13) {
        double d14 = d10 * d10;
        double d15 = (((d12 * 3.0d) / d10) - ((d11 * d11) / d14)) / 3.0d;
        double d16 = (((d13 * 27.0d) / d10) + (((((d11 * 2.0d) * d11) * d11) / (d14 * d10)) - (((9.0d * d11) * d12) / d14))) / 27.0d;
        double dSqrt = Math.sqrt((((d15 * d15) * d15) / 27.0d) + ((d16 * d16) / 4.0d));
        double d17 = (-d16) / 2.0d;
        return (Math.cbrt(d17 - dSqrt) + Math.cbrt(d17 + dSqrt)) - (d11 / (d10 * 3.0d));
    }

    public static final i1.b g(i1.b bVar) {
        if (!(bVar instanceof i1.b)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        f1.n.b("Inconsistent composition");
        throw new b3.e();
    }

    public static x3.j h(qj.f0 f0Var) {
        x3.h hVar = new x3.h();
        hVar.f19829c = new x3.k();
        x3.j jVar = new x3.j(hVar);
        hVar.f19828b = jVar;
        hVar.f19827a = m6.a.class;
        try {
            f0Var.T(new p(3, hVar, f0Var));
            hVar.f19827a = "Deferred.asListenableFuture";
            return jVar;
        } catch (Exception e10) {
            jVar.f19832b.x(e10);
            return jVar;
        }
    }

    public static ri.i i(ri.i iVar) {
        ri.g gVar = iVar.f14549a;
        gVar.b();
        return gVar.B > 0 ? iVar : ri.i.f14548b;
    }

    public static final void j(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
        }
    }

    public static final void k(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
        }
    }

    public static final void l(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbQ = gk.b.q("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            sbQ.append(i12);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(gk.b.l(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }

    public static double n(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float o(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int p(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long q(long j, long j4, long j10) {
        if (j4 <= j10) {
            return j < j4 ? j4 : j > j10 ? j10 : j;
        }
        StringBuilder sbL = m1.l("Cannot coerce value to an empty range: maximum ", " is less than minimum ", j10);
        sbL.append(j4);
        sbL.append('.');
        throw new IllegalArgumentException(sbL.toString());
    }

    public static Comparable r(Comparable comparable, kj.d dVar) {
        fj.l.f(comparable, "<this>");
        fj.l.f(dVar, "range");
        float f10 = dVar.f9664b;
        float f11 = dVar.f9663a;
        if (!dVar.isEmpty()) {
            return (!kj.d.a(comparable, Float.valueOf(f11)) || kj.d.a(Float.valueOf(f11), comparable)) ? (!kj.d.a(Float.valueOf(f10), comparable) || kj.d.a(comparable, Float.valueOf(f10))) ? comparable : Float.valueOf(f10) : Float.valueOf(f11);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + dVar + '.');
    }

    public static Comparable s(Float f10, kj.e eVar) {
        if (eVar instanceof kj.d) {
            return r(f10, (kj.d) eVar);
        }
        if (!eVar.isEmpty()) {
            return f10.compareTo((Float) eVar.b()) < 0 ? eVar.b() : f10.compareTo((Float) eVar.e()) > 0 ? eVar.e() : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + eVar + '.');
    }

    public static Comparable t(s3.f fVar, s3.f fVar2, s3.f fVar3) {
        if (fVar2.compareTo(fVar3) <= 0) {
            return fVar.compareTo(fVar2) < 0 ? fVar2 : fVar.compareTo(fVar3) > 0 ? fVar3 : fVar;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + fVar3 + " is less than minimum " + fVar2 + '.');
    }

    public static byte[] u(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jG = G(0, bArr) & 67108863;
        int i10 = 3;
        long jG2 = (G(3, bArr) >> 2) & 67108611;
        long jG3 = (G(6, bArr) >> 4) & 67092735;
        long jG4 = (G(9, bArr) >> 6) & 66076671;
        long jG5 = (G(12, bArr) >> 8) & 1048575;
        long j = jG2 * 5;
        long j4 = jG3 * 5;
        long j10 = jG4 * 5;
        long j11 = jG5 * 5;
        byte[] bArr3 = new byte[17];
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        int i11 = 0;
        while (i11 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i11);
            System.arraycopy(bArr2, i11, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jG6 = j16 + (G(0, bArr3) & 67108863);
            long jG7 = j12 + ((G(i10, bArr3) >> 2) & 67108863);
            long jG8 = j13 + ((G(6, bArr3) >> 4) & 67108863);
            long jG9 = j14 + ((G(9, bArr3) >> 6) & 67108863);
            long j17 = jG2;
            long jG10 = j15 + (((G(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j18 = (jG10 * j) + (jG9 * j4) + (jG8 * j10) + (jG7 * j11) + (jG6 * jG);
            long j19 = (jG10 * j4) + (jG9 * j10) + (jG8 * j11) + (jG7 * jG) + (jG6 * j17);
            long j20 = (jG10 * j10) + (jG9 * j11) + (jG8 * jG) + (jG7 * j17) + (jG6 * jG3);
            long j21 = (jG10 * j11) + (jG9 * jG) + (jG8 * j17) + (jG7 * jG3) + (jG6 * jG4);
            long j22 = jG9 * j17;
            long j23 = jG10 * jG;
            long j24 = j19 + (j18 >> 26);
            long j25 = j20 + (j24 >> 26);
            long j26 = j21 + (j25 >> 26);
            long j27 = j23 + j22 + (jG8 * jG3) + (jG7 * jG4) + (jG6 * jG5) + (j26 >> 26);
            long j28 = j27 >> 26;
            j15 = j27 & 67108863;
            long j29 = (j28 * 5) + (j18 & 67108863);
            i11 += 16;
            j13 = j25 & 67108863;
            j14 = j26 & 67108863;
            j16 = j29 & 67108863;
            j12 = (j24 & 67108863) + (j29 >> 26);
            jG2 = j17;
            i10 = 3;
        }
        long j30 = j13 + (j12 >> 26);
        long j31 = j30 & 67108863;
        long j32 = j14 + (j30 >> 26);
        long j33 = j32 & 67108863;
        long j34 = j15 + (j32 >> 26);
        long j35 = j34 & 67108863;
        long j36 = ((j34 >> 26) * 5) + j16;
        long j37 = j36 >> 26;
        long j38 = j36 & 67108863;
        long j39 = (j12 & 67108863) + j37;
        long j40 = j38 + 5;
        long j41 = j40 & 67108863;
        long j42 = j39 + (j40 >> 26);
        long j43 = j31 + (j42 >> 26);
        long j44 = j33 + (j43 >> 26);
        long j45 = j44 & 67108863;
        long j46 = (j35 + (j44 >> 26)) - 67108864;
        long j47 = j46 >> 63;
        long j48 = j38 & j47;
        long j49 = j39 & j47;
        long j50 = j31 & j47;
        long j51 = j33 & j47;
        long j52 = j35 & j47;
        long j53 = ~j47;
        long j54 = j49 | (j42 & 67108863 & j53);
        long j55 = j50 | (j43 & 67108863 & j53);
        long j56 = j51 | (j45 & j53);
        long j57 = (j48 | (j41 & j53) | (j54 << 26)) & 4294967295L;
        long j58 = ((j54 >> 6) | (j55 << 20)) & 4294967295L;
        long j59 = ((j55 >> 12) | (j56 << 14)) & 4294967295L;
        long j60 = ((j56 >> 18) | ((j52 | (j46 & j53)) << 8)) & 4294967295L;
        long jG11 = G(16, bArr) + j57;
        long j61 = jG11 & 4294967295L;
        long jG12 = G(20, bArr) + j58 + (jG11 >> 32);
        long jG13 = G(24, bArr) + j59 + (jG12 >> 32);
        long jG14 = (G(28, bArr) + j60 + (jG13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        Q(bArr4, j61, 0);
        Q(bArr4, jG12 & 4294967295L, 4);
        Q(bArr4, jG13 & 4294967295L, 8);
        Q(bArr4, jG14, 12);
        return bArr4;
    }

    public static int v(q0 q0Var, r5.g gVar, View view, View view2, e0 e0Var, boolean z2) {
        if (e0Var.v() == 0 || q0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(e0.H(view) - e0.H(view2)) + 1;
        }
        return Math.min(gVar.n(), gVar.d(view2) - gVar.g(view));
    }

    public static int w(q0 q0Var, r5.g gVar, View view, View view2, e0 e0Var, boolean z2, boolean z10) {
        if (e0Var.v() == 0 || q0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z10 ? Math.max(0, (q0Var.b() - Math.max(e0.H(view), e0.H(view2))) - 1) : Math.max(0, Math.min(e0.H(view), e0.H(view2)));
        if (z2) {
            return Math.round((iMax * (Math.abs(gVar.d(view2) - gVar.g(view)) / (Math.abs(e0.H(view) - e0.H(view2)) + 1))) + (gVar.m() - gVar.g(view)));
        }
        return iMax;
    }

    public static int x(q0 q0Var, r5.g gVar, View view, View view2, e0 e0Var, boolean z2) {
        if (e0Var.v() == 0 || q0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return q0Var.b();
        }
        return (int) (((gVar.d(view2) - gVar.g(view)) / (Math.abs(e0.H(view) - e0.H(view2)) + 1)) * q0Var.b());
    }

    public static byte[] y(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > com.google.android.gms.common.api.f.API_PRIORITY_OTHER - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static final void z(Path path, float f10, float f11, float f12) {
        path.reset();
        float fMin = Math.min(f10, f11) * 0.5f;
        float f13 = f12 < 0.0f ? 0.0f : f12;
        if (f13 <= fMin) {
            fMin = f13;
        }
        if (fMin <= 0.0f) {
            path.addRect(0.0f, 0.0f, f10, f11, Path.Direction.CW);
            return;
        }
        double d10 = fMin;
        ga.a aVar = ga.a.f7254l;
        ga.a aVar2 = ga.a.f7254l;
        float f14 = ((f10 * 0.5f) - fMin) / fMin;
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        float f15 = ((0.5f * f11) - fMin) / fMin;
        double[] dArrC = aVar2.c(f14, (f15 >= 0.0f ? f15 : 0.0f) <= 1.0f ? r2 : 1.0f);
        if (dArrC.length < 20) {
            path.addRoundRect(0.0f, 0.0f, f10, f11, f12, f12, Path.Direction.CW);
            return;
        }
        double d11 = f11;
        double d12 = f10 - d10;
        path.moveTo((float) ((dArrC[0] * d10) + d12), (float) ((dArrC[1] * d10) + 0.0d));
        path.cubicTo((float) ((dArrC[2] * d10) + d12), (float) ((dArrC[3] * d10) + 0.0d), (float) ((dArrC[4] * d10) + d12), (float) ((dArrC[5] * d10) + 0.0d), (float) ((dArrC[6] * d10) + d12), (float) ((dArrC[7] * d10) + 0.0d));
        path.cubicTo((float) ((dArrC[8] * d10) + d12), (float) ((dArrC[9] * d10) + 0.0d), (float) ((dArrC[10] * d10) + d12), (float) ((dArrC[11] * d10) + 0.0d), (float) ((dArrC[12] * d10) + d12), (float) ((dArrC[13] * d10) + 0.0d));
        path.cubicTo((float) ((dArrC[14] * d10) + d12), (float) ((dArrC[15] * d10) + 0.0d), (float) ((dArrC[16] * d10) + d12), (float) ((dArrC[17] * d10) + 0.0d), (float) ((dArrC[18] * d10) + d12), (float) ((dArrC[19] * d10) + 0.0d));
        path.lineTo((float) ((dArrC[18] * d10) + d12), (float) (d11 - (dArrC[19] * d10)));
        path.cubicTo((float) ((dArrC[16] * d10) + d12), (float) (d11 - (dArrC[17] * d10)), (float) ((dArrC[14] * d10) + d12), (float) (d11 - (dArrC[15] * d10)), (float) ((dArrC[12] * d10) + d12), (float) (d11 - (dArrC[13] * d10)));
        path.cubicTo((float) ((dArrC[10] * d10) + d12), (float) (d11 - (dArrC[11] * d10)), (float) ((dArrC[8] * d10) + d12), (float) (d11 - (dArrC[9] * d10)), (float) ((dArrC[6] * d10) + d12), (float) (d11 - (dArrC[7] * d10)));
        path.cubicTo((float) ((dArrC[4] * d10) + d12), (float) (d11 - (dArrC[5] * d10)), (float) ((dArrC[2] * d10) + d12), (float) (d11 - (dArrC[3] * d10)), (float) ((dArrC[0] * d10) + d12), (float) (d11 - (dArrC[1] * d10)));
        path.lineTo((float) (d10 - (dArrC[0] * d10)), (float) (d11 - (dArrC[1] * d10)));
        path.cubicTo((float) (d10 - (dArrC[2] * d10)), (float) (d11 - (dArrC[3] * d10)), (float) (d10 - (dArrC[4] * d10)), (float) (d11 - (dArrC[5] * d10)), (float) (d10 - (dArrC[6] * d10)), (float) (d11 - (dArrC[7] * d10)));
        path.cubicTo((float) (d10 - (dArrC[8] * d10)), (float) (d11 - (dArrC[9] * d10)), (float) (d10 - (dArrC[10] * d10)), (float) (d11 - (dArrC[11] * d10)), (float) (d10 - (dArrC[12] * d10)), (float) (d11 - (dArrC[13] * d10)));
        path.cubicTo((float) (d10 - (dArrC[14] * d10)), (float) (d11 - (dArrC[15] * d10)), (float) (d10 - (dArrC[16] * d10)), (float) (d11 - (dArrC[17] * d10)), (float) (d10 - (dArrC[18] * d10)), (float) (d11 - (dArrC[19] * d10)));
        path.lineTo((float) (d10 - (dArrC[18] * d10)), (float) ((dArrC[19] * d10) + 0.0d));
        path.cubicTo((float) (d10 - (dArrC[16] * d10)), (float) ((dArrC[17] * d10) + 0.0d), (float) (d10 - (dArrC[14] * d10)), (float) ((dArrC[15] * d10) + 0.0d), (float) (d10 - (dArrC[12] * d10)), (float) ((dArrC[13] * d10) + 0.0d));
        path.cubicTo((float) (d10 - (dArrC[10] * d10)), (float) ((dArrC[11] * d10) + 0.0d), (float) (d10 - (dArrC[8] * d10)), (float) ((dArrC[9] * d10) + 0.0d), (float) (d10 - (dArrC[6] * d10)), (float) ((dArrC[7] * d10) + 0.0d));
        path.cubicTo((float) (d10 - (dArrC[4] * d10)), (float) ((dArrC[5] * d10) + 0.0d), (float) (d10 - (dArrC[2] * d10)), (float) ((dArrC[3] * d10) + 0.0d), (float) (d10 - (dArrC[0] * d10)), (float) ((dArrC[1] * d10) + 0.0d));
        path.close();
    }

    public abstract List m(String str, List list);
}
