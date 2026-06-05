package qh;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import c1.u1;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzli;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzlq;
import f1.l1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import pg.s;
import q.p;
import q.p0;
import q.q;
import q2.d;
import qi.v;
import rg.d0;
import rg.h;
import rg.h0;
import rg.k;
import s1.j;
import t1.g;
import t1.r;
import t2.e0;
import t2.m0;
import t2.m1;
import t2.n1;
import t4.m;
import t6.e1;
import t6.t0;
import t6.z0;
import uf.l;
import uf.n;
import uf.o;
import ug.i;
import v2.f0;
import vf.f;
import w5.i0;
import w5.w;
import w8.t;
import y3.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c implements s, i, j, m1, e7.b, t, m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13506a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13507b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13508c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f13506a = i10;
        this.f13507b = obj;
        this.f13508c = obj2;
    }

    public void A(int i10) {
        int[] iArr = (int[]) this.f13507b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i10, 10) + 1];
            this.f13507b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i10 >= iArr.length) {
            int length = iArr.length;
            while (length <= i10) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f13507b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f13507b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory B(java.lang.String r14) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qh.c.B(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public File C() {
        if (((File) this.f13507b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f13507b) == null) {
                        cg.i iVar = (cg.i) this.f13508c;
                        iVar.b();
                        this.f13507b = new File(iVar.f3367a.getFilesDir(), "PersistedInstallation." + ((cg.i) this.f13508c).g() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f13507b;
    }

    public e0 D() {
        m0 m0Var = (m0) this.f13507b;
        f0 f0Var = (f0) m0Var.C.g(this.f13508c);
        if (f0Var != null) {
            return (e0) m0Var.f15605f.g(f0Var);
        }
        return null;
    }

    public void E(a aVar) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f13496a);
            jSONObject.put("Status", e.b(aVar.f13497b));
            jSONObject.put("AuthToken", aVar.f13498c);
            jSONObject.put("RefreshToken", aVar.f13499d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f13501f);
            jSONObject.put("ExpiresInSecs", aVar.f13500e);
            jSONObject.put("FisError", aVar.f13502g);
            cg.i iVar = (cg.i) this.f13508c;
            iVar.b();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", iVar.f3367a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(C())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void F(int i10, int i11) {
        int[] iArr = (int[]) this.f13507b;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        A(i12);
        int[] iArr2 = (int[]) this.f13507b;
        System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
        Arrays.fill((int[]) this.f13507b, i10, i12, -1);
        ArrayList arrayList = (ArrayList) this.f13508c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z0 z0Var = (z0) ((ArrayList) this.f13508c).get(size);
            int i13 = z0Var.f16087a;
            if (i13 >= i10) {
                z0Var.f16087a = i13 + i11;
            }
        }
    }

    public void G(int i10, int i11) {
        int[] iArr = (int[]) this.f13507b;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        A(i12);
        int[] iArr2 = (int[]) this.f13507b;
        System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
        int[] iArr3 = (int[]) this.f13507b;
        Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f13508c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z0 z0Var = (z0) ((ArrayList) this.f13508c).get(size);
            int i13 = z0Var.f16087a;
            if (i13 >= i10) {
                if (i13 < i12) {
                    ((ArrayList) this.f13508c).remove(size);
                } else {
                    z0Var.f16087a = i13 - i11;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 r8.n, still in use, count: 3, list:
          (r1v0 r8.n) from 0x008b: MOVE (r18v0 r8.n) = (r1v0 r8.n) (LINE:140)
          (r1v0 r8.n) from 0x007b: MOVE (r18v3 r8.n) = (r1v0 r8.n) (LINE:124)
          (r1v0 r8.n) from 0x0070: MOVE (r18v5 r8.n) = (r1v0 r8.n) (LINE:113)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public r8.n H(r8.g r20, s8.h r21) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qh.c.H(r8.g, s8.h):r8.n");
    }

    public u1 I(t0 t0Var, int i10) {
        e1 e1Var;
        u1 u1Var;
        p0 p0Var = (p0) this.f13507b;
        int iD = p0Var.d(t0Var);
        if (iD >= 0 && (e1Var = (e1) p0Var.i(iD)) != null) {
            int i11 = e1Var.f15884a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                e1Var.f15884a = i12;
                if (i10 == 4) {
                    u1Var = e1Var.f15885b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    u1Var = e1Var.f15886c;
                }
                if ((i12 & 12) == 0) {
                    p0Var.g(iD);
                    e1Var.f15884a = 0;
                    e1Var.f15885b = null;
                    e1Var.f15886c = null;
                    e1.f15883d.c(e1Var);
                }
                return u1Var;
            }
        }
        return null;
    }

    public a J() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(C());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i11 = e.c(5)[iOptInt];
        if (i11 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i11 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new a(strOptString, i11, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void K(l lVar) throws GeneralSecurityException {
        HashMap map = (HashMap) this.f13507b;
        n nVar = new n(lVar.f17046a, f.class);
        if (!map.containsKey(nVar)) {
            map.put(nVar, lVar);
            return;
        }
        l lVar2 = (l) map.get(nVar);
        if (lVar2.equals(lVar) && lVar.equals(lVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + nVar);
    }

    public void L(nf.m mVar) throws GeneralSecurityException {
        HashMap map = (HashMap) this.f13508c;
        if (mVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class clsC = mVar.c();
        if (!map.containsKey(clsC)) {
            map.put(clsC, mVar);
            return;
        }
        nf.m mVar2 = (nf.m) map.get(clsC);
        if (mVar2.equals(mVar) && mVar.equals(mVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsC);
    }

    public void M(t0 t0Var) {
        e1 e1Var = (e1) ((p0) this.f13507b).get(t0Var);
        if (e1Var == null) {
            return;
        }
        e1Var.f15884a &= -2;
    }

    public void N(t0 t0Var) {
        p pVar = (p) this.f13508c;
        int iG = pVar.g() - 1;
        while (true) {
            if (iG < 0) {
                break;
            }
            if (t0Var == pVar.h(iG)) {
                Object[] objArr = pVar.f13113c;
                Object obj = objArr[iG];
                Object obj2 = q.f13118a;
                if (obj != obj2) {
                    objArr[iG] = obj2;
                    pVar.f13111a = true;
                }
            } else {
                iG--;
            }
        }
        e1 e1Var = (e1) ((p0) this.f13507b).remove(t0Var);
        if (e1Var != null) {
            e1Var.f15884a = 0;
            e1Var.f15885b = null;
            e1Var.f15886c = null;
            e1.f15883d.c(e1Var);
        }
    }

    public void O() {
        synchronized (this) {
            ((AtomicInteger) this.f13507b).decrementAndGet();
            if (((AtomicInteger) this.f13507b).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public r8.n P(r8.n nVar) {
        h8.i iVar;
        boolean z2;
        h8.i iVar2 = nVar.j;
        gf.f fVar = r8.i.f13892b;
        if (((Bitmap.Config) h8.n.e(nVar, fVar)) != Bitmap.Config.HARDWARE || ((v8.e) this.f13508c).b()) {
            iVar = iVar2;
            z2 = false;
        } else {
            iVar2.getClass();
            LinkedHashMap linkedHashMapN0 = v.n0(iVar2.f7703a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMapN0.put(fVar, config);
            } else {
                linkedHashMapN0.remove(fVar);
            }
            h8.i iVar3 = new h8.i(u0.c.p(linkedHashMapN0));
            z2 = true;
            iVar = iVar3;
        }
        return z2 ? new r8.n(nVar.f13901a, nVar.f13902b, nVar.f13903c, nVar.f13904d, nVar.f13905e, nVar.f13906f, nVar.f13907g, nVar.f13908h, nVar.f13909i, iVar) : nVar;
    }

    public void Q(zzjz zzjzVar) {
        if (zzjzVar == null) {
            return;
        }
        try {
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo((zzku) this.f13507b);
            zzliVarZzc.zza(zzjzVar);
            ((g6.b) this.f13508c).c((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th2) {
            zze.zzm("BillingLogger", "Unable to log.", th2);
        }
    }

    public void R(zzkd zzkdVar) {
        if (zzkdVar == null) {
            return;
        }
        try {
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo((zzku) this.f13507b);
            zzliVarZzc.zzm(zzkdVar);
            ((g6.b) this.f13508c).c((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th2) {
            zze.zzm("BillingLogger", "Unable to log.", th2);
        }
    }

    public void S(zzlq zzlqVar) {
        try {
            g6.b bVar = (g6.b) this.f13508c;
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo((zzku) this.f13507b);
            zzliVarZzc.zzp(zzlqVar);
            bVar.c((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th2) {
            zze.zzm("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // t2.m1
    public boolean a(ac.l lVar) {
        e0 e0VarD = D();
        l1 l1Var = e0VarD != null ? e0VarD.f15538f : null;
        if (l1Var == null || l1Var.c()) {
            return true;
        }
        g gVarF = r.f();
        ej.c cVarE = gVarF != null ? gVarF.e() : null;
        g gVarK = r.k(gVarF);
        try {
            return l1Var.e(lVar);
        } catch (Throwable th2) {
            try {
                e0VarD.getClass();
                throw th2;
            } finally {
                r.n(gVarF, gVarK, cVarE);
            }
        }
    }

    @Override // t2.m1
    public n1 apply() {
        m0 m0Var = (m0) this.f13507b;
        e0 e0VarD = D();
        if (e0VarD != null) {
            m0Var.d(e0VarD, false);
        }
        return m0Var.f(this.f13508c);
    }

    @Override // pg.s
    public void b(String str, String str2) {
        ((k) ((p7.k) this.f13508c).f12813b).g(((h0) this.f13507b).c(str != null ? mg.b.a(str, str2) : null));
    }

    @Override // s1.j
    public Object c(Object obj) {
        return ((ej.c) this.f13508c).invoke(obj);
    }

    @Override // t2.m1
    public void cancel() {
        e0 e0VarD = D();
        if ((e0VarD != null ? e0VarD.f15538f : null) != null) {
            m0.c((m0) this.f13507b, this.f13508c);
        }
    }

    @Override // s1.j
    public Object d(s1.a aVar, Object obj) {
        return ((ej.e) this.f13507b).invoke(aVar, obj);
    }

    @Override // t2.m1
    public boolean e() {
        l1 l1Var;
        e0 e0VarD = D();
        if (e0VarD == null || (l1Var = e0VarD.f15538f) == null) {
            return true;
        }
        return l1Var.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #3 {all -> 0x00a6, blocks: (B:20:0x004c, B:22:0x0050, B:25:0x0061, B:29:0x0068, B:31:0x0075, B:33:0x0080, B:32:0x007b, B:27:0x0065, B:28:0x0067, B:45:0x009e, B:46:0x00a5, B:24:0x005c), top: B:73:0x004c, outer: #5, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[Catch: all -> 0x00a6, TRY_ENTER, TryCatch #3 {all -> 0x00a6, blocks: (B:20:0x004c, B:22:0x0050, B:25:0x0061, B:29:0x0068, B:31:0x0075, B:33:0x0080, B:32:0x007b, B:27:0x0065, B:28:0x0067, B:45:0x009e, B:46:0x00a5, B:24:0x005c), top: B:73:0x004c, outer: #5, inners: #0 }] */
    @Override // e7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e7.a f(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qh.c.f(java.lang.String):e7.a");
    }

    public void g(t0 t0Var, u1 u1Var) {
        p0 p0Var = (p0) this.f13507b;
        e1 e1VarA = (e1) p0Var.get(t0Var);
        if (e1VarA == null) {
            e1VarA = e1.a();
            p0Var.put(t0Var, e1VarA);
        }
        e1VarA.f15886c = u1Var;
        e1VarA.f15884a |= 8;
    }

    @Override // ug.i
    public boolean h(Object obj) {
        d0 d0Var = (d0) obj;
        h hVar = (h) this.f13508c;
        d0Var.getClass();
        h hVar2 = d0Var.f14392b;
        if (((List) this.f13507b).contains(Long.valueOf(d0Var.f14391a))) {
            return false;
        }
        return hVar2.x(hVar) || hVar.x(hVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    @Override // t4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t4.m1 i(android.view.View r21, t4.m1 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.Object r3 = r0.f13507b
            g6.b r3 = (g6.b) r3
            java.lang.Object r4 = r0.f13508c
            yd.c r4 = (yd.c) r4
            int r5 = r4.f20278a
            int r6 = r4.f20279b
            int r4 = r4.f20280c
            t4.j1 r7 = r2.f15751a
            r8 = 519(0x207, float:7.27E-43)
            l4.b r8 = r7.g(r8)
            r9 = 32
            l4.b r9 = r7.g(r9)
            java.lang.Object r10 = r3.f7218c
            com.google.android.material.bottomsheet.BottomSheetBehavior r10 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r10
            int r11 = r8.f9968b
            int r12 = r8.f9969c
            int r13 = r8.f9967a
            r10.f3820w = r11
            int r11 = r1.getLayoutDirection()
            r15 = 1
            if (r11 != r15) goto L37
            r11 = r15
            goto L38
        L37:
            r11 = 0
        L38:
            int r16 = r1.getPaddingBottom()
            int r17 = r1.getPaddingLeft()
            int r18 = r1.getPaddingRight()
            boolean r14 = r10.f3812o
            if (r14 == 0) goto L52
            l4.b r7 = r7.l()
            int r7 = r7.f9970d
            r10.f3819v = r7
            int r16 = r4 + r7
        L52:
            r4 = r16
            boolean r7 = r10.f3813p
            if (r7 == 0) goto L5f
            if (r11 == 0) goto L5c
            r7 = r6
            goto L5d
        L5c:
            r7 = r5
        L5d:
            int r17 = r7 + r13
        L5f:
            r7 = r17
            boolean r15 = r10.f3814q
            if (r15 == 0) goto L6b
            if (r11 == 0) goto L68
            goto L69
        L68:
            r5 = r6
        L69:
            int r18 = r5 + r12
        L6b:
            r5 = r18
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            boolean r11 = r10.f3816s
            if (r11 == 0) goto L80
            int r11 = r6.leftMargin
            if (r11 == r13) goto L80
            r6.leftMargin = r13
            r19 = 1
            goto L82
        L80:
            r19 = 0
        L82:
            boolean r11 = r10.f3817t
            if (r11 == 0) goto L8e
            int r11 = r6.rightMargin
            if (r11 == r12) goto L8e
            r6.rightMargin = r12
            r19 = 1
        L8e:
            boolean r11 = r10.f3818u
            if (r11 == 0) goto L9c
            int r11 = r6.topMargin
            int r8 = r8.f9968b
            if (r11 == r8) goto L9c
            r6.topMargin = r8
            r15 = 1
            goto L9e
        L9c:
            r15 = r19
        L9e:
            if (r15 == 0) goto La3
            r1.setLayoutParams(r6)
        La3:
            int r6 = r1.getPaddingTop()
            r1.setPadding(r7, r6, r5, r4)
            boolean r1 = r3.f7217b
            if (r1 == 0) goto Lb2
            int r3 = r9.f9970d
            r10.f3810m = r3
        Lb2:
            if (r14 != 0) goto Lb8
            if (r1 == 0) goto Lb7
            goto Lb8
        Lb7:
            return r2
        Lb8:
            r10.I()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qh.c.i(android.view.View, t4.m1):t4.m1");
    }

    public boolean j() {
        synchronized (this) {
            if (((AtomicBoolean) this.f13508c).get()) {
                return false;
            }
            ((AtomicInteger) this.f13507b).incrementAndGet();
            return true;
        }
    }

    public void k() {
        int[] iArr = (int[]) this.f13507b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f13508c = null;
    }

    public void l(w5.t tVar, boolean z2) {
        fj.l.f(tVar, "f");
        w5.t tVar2 = ((i0) this.f13507b).f18664y;
        if (tVar2 != null) {
            tVar2.o().f18654o.l(tVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f13508c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void m(w5.t tVar, boolean z2) {
        fj.l.f(tVar, "f");
        i0 i0Var = (i0) this.f13507b;
        w wVar = i0Var.f18662w.f18777e;
        w5.t tVar2 = i0Var.f18664y;
        if (tVar2 != null) {
            tVar2.o().f18654o.m(tVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f13508c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void n(w5.t tVar, boolean z2) {
        fj.l.f(tVar, "f");
        w5.t tVar2 = ((i0) this.f13507b).f18664y;
        if (tVar2 != null) {
            tVar2.o().f18654o.n(tVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f13508c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void o(w5.t tVar, boolean z2) {
        fj.l.f(tVar, "f");
        w5.t tVar2 = ((i0) this.f13507b).f18664y;
        if (tVar2 != null) {
            tVar2.o().f18654o.o(tVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f13508c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void p(w5.t tVar, boolean z2) {
        fj.l.f(tVar, "f");
        w5.t tVar2 = ((i0) this.f13507b).f18664y;
        if (tVar2 != null) {
            tVar2.o().f18654o.p(tVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f13508c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void q(w5.t tVar, boolean z2) {
        fj.l.f(tVar, "f");
        w5.t tVar2 = ((i0) this.f13507b).f18664y;
        if (tVar2 != null) {
            tVar2.o().f18654o.q(tVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f13508c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void r(w5.t tVar, boolean z2) {
        fj.l.f(tVar, "f");
        i0 i0Var = (i0) this.f13507b;
        w wVar = i0Var.f18662w.f18777e;
        w5.t tVar2 = i0Var.f18664y;
        if (tVar2 != null) {
            tVar2.o().f18654o.r(tVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f13508c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void s(w5.t tVar, boolean z2) {
        fj.l.f(tVar, "f");
        w5.t tVar2 = ((i0) this.f13507b).f18664y;
        if (tVar2 != null) {
            tVar2.o().f18654o.s(tVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f13508c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void t(w5.t tVar, boolean z2) {
        fj.l.f(tVar, "f");
        w5.t tVar2 = ((i0) this.f13507b).f18664y;
        if (tVar2 != null) {
            tVar2.o().f18654o.t(tVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f13508c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        switch (this.f13506a) {
            case 19:
                String str = "[ ";
                if (((y3.f) this.f13507b) != null) {
                    for (int i10 = 0; i10 < 9; i10++) {
                        str = str + ((y3.f) this.f13507b).A[i10] + " ";
                    }
                }
                return str + "] " + ((y3.f) this.f13507b);
            default:
                return super.toString();
        }
    }

    public void u(w5.t tVar, Bundle bundle, boolean z2) {
        fj.l.f(tVar, "f");
        w5.t tVar2 = ((i0) this.f13507b).f18664y;
        if (tVar2 != null) {
            tVar2.o().f18654o.u(tVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f13508c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void v(w5.t tVar, boolean z2) {
        fj.l.f(tVar, "f");
        w5.t tVar2 = ((i0) this.f13507b).f18664y;
        if (tVar2 != null) {
            tVar2.o().f18654o.v(tVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f13508c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // e7.b
    public boolean w() {
        return ((e7.b) this.f13507b).w();
    }

    public void x(w5.t tVar, boolean z2) {
        fj.l.f(tVar, "f");
        w5.t tVar2 = ((i0) this.f13507b).f18664y;
        if (tVar2 != null) {
            tVar2.o().f18654o.x(tVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f13508c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void y(w5.t tVar, View view, boolean z2) {
        fj.l.f(tVar, "f");
        fj.l.f(view, "v");
        w5.t tVar2 = ((i0) this.f13507b).f18664y;
        if (tVar2 != null) {
            tVar2.o().f18654o.y(tVar, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f13508c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void z(w5.t tVar, boolean z2) {
        fj.l.f(tVar, "f");
        w5.t tVar2 = ((i0) this.f13507b).f18664y;
        if (tVar2 != null) {
            tVar2.o().f18654o.z(tVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f13508c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.f13506a = i10;
        this.f13508c = obj;
    }

    public c(Context context, zzku zzkuVar) {
        this.f13506a = 16;
        g6.b bVar = new g6.b();
        try {
            ub.p.b(context);
            bVar.f7218c = ub.p.a().c(sb.a.f14960e).a("PLAY_BILLING_LIBRARY", new rb.c("proto"), new h9.a(16));
        } catch (Throwable unused) {
            bVar.f7217b = true;
        }
        this.f13508c = bVar;
        this.f13507b = zzkuVar;
    }

    public c(int i10) {
        this.f13506a = i10;
        switch (i10) {
            case 8:
                this.f13507b = new p0(0);
                this.f13508c = new p((Object) null);
                break;
            case 10:
                this.f13507b = new HashMap();
                this.f13508c = new HashMap();
                break;
            case 18:
                this.f13507b = new d(0);
                this.f13508c = new d(0);
                break;
        }
    }

    public c(i0 i0Var) {
        this.f13506a = 15;
        this.f13507b = i0Var;
        this.f13508c = new CopyOnWriteArrayList();
    }

    public c(h8.r rVar) {
        Object aVar;
        this.f13506a = 1;
        this.f13507b = rVar;
        int i10 = Build.VERSION.SDK_INT;
        if (v8.f.f17888a) {
            aVar = new tg.a(false);
        } else if (i10 == 27) {
            aVar = new v8.i();
        } else {
            aVar = new tg.a(true);
        }
        this.f13508c = aVar;
    }

    public c(rg.e eVar) {
        this.f13506a = 17;
        this.f13507b = eVar.f14396b;
        this.f13508c = eVar.a("EventRaiser");
    }

    public c(a2.i iVar) {
        this.f13506a = 12;
        this.f13507b = new AtomicInteger(0);
        this.f13508c = new AtomicBoolean(false);
    }

    public c(o oVar) {
        this.f13506a = 10;
        this.f13507b = new HashMap(oVar.f17050a);
        this.f13508c = new HashMap(oVar.f17051b);
    }

    public c(b4.e eVar, e7.b bVar) {
        this.f13506a = 9;
        fj.l.f(bVar, "actual");
        this.f13508c = eVar;
        this.f13507b = bVar;
    }

    public c(Context context) {
        this.f13506a = 13;
        this.f13508c = null;
        this.f13507b = context;
    }

    public c(p7.k kVar, h0 h0Var) {
        this.f13506a = 2;
        this.f13508c = kVar;
        this.f13507b = h0Var;
    }

    public c(EditText editText) {
        this.f13506a = 6;
        this.f13507b = editText;
        t5.i iVar = new t5.i(editText);
        this.f13508c = iVar;
        editText.addTextChangedListener(iVar);
        if (t5.a.f15800b == null) {
            synchronized (t5.a.f15799a) {
                try {
                    if (t5.a.f15800b == null) {
                        t5.a aVar = new t5.a();
                        try {
                            t5.a.f15801c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, t5.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        t5.a.f15800b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(t5.a.f15800b);
    }

    public c(boolean z2, List list, h hVar) {
        this.f13506a = 3;
        this.f13507b = list;
        this.f13508c = hVar;
    }
}
