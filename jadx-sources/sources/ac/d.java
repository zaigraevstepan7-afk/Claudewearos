package ac;

import a2.f0;
import a2.q;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.lifecycle.w0;
import androidx.work.impl.WorkDatabase_Impl;
import c1.s3;
import c2.u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.shaded.protobuf.c0;
import f1.q2;
import f1.u1;
import g0.z;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.zip.Adler32;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k0.r0;
import k3.e0;
import m.y;
import q.g0;
import q.r;
import t.m1;
import uf.p;
import w2.d2;
import w2.g1;
import zf.e1;
import zf.f1;
import zf.n0;
import zf.q1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements yf.a, f8.a, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f372a;

    /* renamed from: b, reason: collision with root package name */
    public Object f373b;

    /* renamed from: c, reason: collision with root package name */
    public Object f374c;

    /* renamed from: d, reason: collision with root package name */
    public Object f375d;

    public /* synthetic */ d(int i10, boolean z2) {
        this.f372a = i10;
    }

    public static d F(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new d(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static final d H(nf.f fVar, tf.b bVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) fVar.f12320b;
        try {
            n0 n0VarA = n0.A(byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.o.a());
            byteArrayInputStream.close();
            if (n0VarA.y().size() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                f1 f1VarE = f1.E(bVar.b(n0VarA.y().x(), bArr), com.google.crypto.tink.shaded.protobuf.o.a());
                if (f1VarE.z() > 0) {
                    return g(f1VarE);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (c0 unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (Throwable th2) {
            byteArrayInputStream.close();
            throw th2;
        }
    }

    public static void T(HashMap map) {
        if (!"websocket".equals(map.get("upgrade"))) {
            throw new ah.f("connection failed: missing header field in server handshake: Upgrade");
        }
        if (!"upgrade".equals(map.get("connection"))) {
            throw new ah.f("connection failed: missing header field in server handshake: Connection");
        }
    }

    public static void U(String str) throws NumberFormatException {
        int i10 = Integer.parseInt(str.substring(9, 12));
        if (i10 == 407) {
            throw new ah.f("connection failed: proxy authentication not supported");
        }
        if (i10 == 404) {
            throw new ah.f("connection failed: 404 not found");
        }
        if (i10 != 101) {
            throw new ah.f(m6.a.d(i10, "connection failed: unknown status code "));
        }
    }

    public static final d g(f1 f1Var) throws GeneralSecurityException {
        if (f1Var.z() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(f1Var.z());
        for (e1 e1Var : f1Var.A()) {
            e1Var.getClass();
            try {
                try {
                    nf.b bVarA = uf.i.f17042b.a(p.m(e1Var.A().B(), e1Var.A().C(), e1Var.A().A(), e1Var.C(), e1Var.C() == q1.RAW ? null : Integer.valueOf(e1Var.B())));
                    int iOrdinal = e1Var.D().ordinal();
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new nf.h(bVarA));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e10) {
                throw new b3.e("Creating a protokey serialization failed", e10);
            }
        }
        return new d(f1Var, Collections.unmodifiableList(arrayList));
    }

    public int A() {
        return ((Number) ((g0.e) this.f373b).a()).intValue();
    }

    public void B(Throwable th2) {
        String str = th2 instanceof OutOfMemoryError ? "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data" : th2 instanceof NoClassDefFoundError ? "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk" : th2 instanceof mg.c ? "" : "Uncaught exception in Firebase Database runloop (21.0.0). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk";
        ((p1.l) this.f374c).o(str, th2);
        new Handler(((Context) ((t0.j) this.f375d).f15363b).getMainLooper()).post(new a8.e(13, str, th2, false));
        ((ug.b) this.f373b).shutdownNow();
    }

    public void C(c8.d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f373b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((c8.b) this.f374c).l(dVar);
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.h();
        }
    }

    public boolean D() {
        if (((q2) this.f373b).getValue() != this.f375d) {
            return true;
        }
        d dVar = (d) this.f374c;
        return dVar != null && dVar.D();
    }

    public boolean E(int i10, a4.d dVar, d4.f fVar) {
        b4.b bVar = (b4.b) this.f374c;
        int[] iArr = dVar.f129o0;
        int[] iArr2 = dVar.f133s;
        bVar.f1521a = iArr[0];
        bVar.f1522b = iArr[1];
        bVar.f1523c = dVar.n();
        bVar.f1524d = dVar.k();
        bVar.f1529i = false;
        bVar.j = i10;
        boolean z2 = bVar.f1521a == 3;
        boolean z10 = bVar.f1522b == 3;
        boolean z11 = z2 && dVar.V > 0.0f;
        boolean z12 = z10 && dVar.V > 0.0f;
        if (z11 && iArr2[0] == 4) {
            bVar.f1521a = 1;
        }
        if (z12 && iArr2[1] == 4) {
            bVar.f1522b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.J(bVar.f1525e);
        dVar.G(bVar.f1526f);
        dVar.D = bVar.f1528h;
        dVar.D(bVar.f1527g);
        bVar.j = 0;
        return bVar.f1529i;
    }

    public void G(androidx.lifecycle.n nVar) {
        w0 w0Var = (w0) this.f375d;
        if (w0Var != null) {
            w0Var.run();
        }
        w0 w0Var2 = new w0((v) this.f373b, nVar);
        this.f375d = w0Var2;
        ((Handler) this.f374c).postAtFrontOfQueue(w0Var2);
    }

    public void I() {
        ((TypedArray) this.f374c).recycle();
    }

    public void J(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f373b;
        workDatabase_Impl.b();
        c8.e eVar = (c8.e) this.f375d;
        g7.i iVarA = eVar.a();
        if (str == null) {
            iVarA.R(1);
        } else {
            iVarA.k(1, str);
        }
        workDatabase_Impl.c();
        try {
            iVarA.b();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.h();
            eVar.i(iVarA);
        }
    }

    public Object K(fj.f fVar, zk.a aVar, ak.v vVar) {
        fj.l.f(aVar, "scopeQualifier");
        uk.b bVar = (uk.b) ((ConcurrentHashMap) this.f374c).get(dl.a.a(fVar) + "::" + aVar);
        Object objB = bVar != null ? bVar.b(vVar) : null;
        if (objB == null) {
            return null;
        }
        return objB;
    }

    public boolean L(int i10) {
        d2 d2Var;
        if (i10 == 7 || i10 == 2 || i10 == 6 || i10 == 5 || i10 == 3 || i10 == 4) {
            q();
        } else if (i10 != 1 && i10 != 0) {
            throw new IllegalStateException("invalid ImeAction");
        }
        if (i10 == 6) {
            a2.m mVar = (a2.m) this.f375d;
            if (mVar != null) {
                ((q) mVar).g(1, true);
                return true;
            }
            fj.l.l("focusManager");
            throw null;
        }
        if (i10 != 5) {
            if (i10 != 7 || (d2Var = (d2) this.f373b) == null) {
                return false;
            }
            ((g1) d2Var).a();
            return true;
        }
        a2.m mVar2 = (a2.m) this.f375d;
        if (mVar2 != null) {
            ((q) mVar2).g(2, true);
            return true;
        }
        fj.l.l("focusManager");
        throw null;
    }

    public void M(ub.i iVar, int i10, boolean z2) {
        b bVar = (b) this.f375d;
        Context context = (Context) this.f373b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f16961a;
        String str2 = iVar.f16961a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        rb.d dVar = iVar.f16963c;
        adler32.update(byteBufferAllocate.putInt(ec.a.a(dVar)).array());
        byte[] bArr = iVar.f16962b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z2) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        u0.c.h(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor cursorRawQuery = ((bc.h) ((bc.d) this.f374c)).b().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(ec.a.a(dVar))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(bVar.a(dVar, jLongValue, i10));
            Set set = ((c) bVar.f368b.get(dVar)).f371c;
            if (set.contains(f.f379a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(f.f381c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(f.f380b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", ec.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(bVar.a(dVar, jLongValue, i10)), lValueOf, Integer.valueOf(i10)};
            String strConcat = "TRuntime.".concat("JobInfoScheduler");
            if (Log.isLoggable(strConcat, 3)) {
                Log.d(strConcat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    public void N(u uVar) {
        ((e2.b) this.f375d).f5737a.f5735c = uVar;
    }

    public void O(s3.c cVar) {
        ((e2.b) this.f375d).f5737a.f5733a = cVar;
    }

    public void P(s3.m mVar) {
        ((e2.b) this.f375d).f5737a.f5734b = mVar;
    }

    public void Q(long j) {
        ((e2.b) this.f375d).f5737a.f5736d = j;
    }

    public void R(a4.e eVar, int i10, int i11, int i12) {
        int i13 = eVar.f102a0;
        int i14 = eVar.f104b0;
        eVar.f102a0 = 0;
        eVar.f104b0 = 0;
        eVar.J(i11);
        eVar.G(i12);
        if (i13 < 0) {
            eVar.f102a0 = 0;
        } else {
            eVar.f102a0 = i13;
        }
        if (i14 < 0) {
            eVar.f104b0 = 0;
        } else {
            eVar.f104b0 = i14;
        }
        a4.e eVar2 = (a4.e) this.f375d;
        eVar2.f144s0 = i10;
        eVar2.P();
    }

    public void S(a4.e eVar) {
        ArrayList arrayList = (ArrayList) this.f373b;
        arrayList.clear();
        int size = eVar.f141p0.size();
        for (int i10 = 0; i10 < size; i10++) {
            a4.d dVar = (a4.d) eVar.f141p0.get(i10);
            int[] iArr = dVar.f129o0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f143r0.f1533b = true;
    }

    @Override // yf.a
    public byte[] a(int i10, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrX;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!gk.b.a(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) ag.k.f450b.f452a.q("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.f373b);
        int iMax = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrX = cg.b.W(bArr, (iMax - 1) * 16, (byte[]) this.f374c, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = Byte.MIN_VALUE;
            bArrX = cg.b.X(bArrCopyOf, (byte[]) this.f375d);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i11 = 0; i11 < iMax - 1; i11++) {
            bArrDoFinal = cipher.doFinal(cg.b.W(bArrDoFinal, 0, bArr, i11 * 16, 16));
        }
        return Arrays.copyOf(cipher.doFinal(cg.b.X(bArrX, bArrDoFinal)), i10);
    }

    public of.i b() throws GeneralSecurityException {
        d8.e eVar;
        of.k kVar = (of.k) this.f373b;
        if (kVar == null || (eVar = (d8.e) this.f374c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (kVar.f12473b != ((bg.a) eVar.f5001a).f1773a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        of.j jVar = kVar.f12476e;
        of.j jVar2 = of.j.f12459e;
        if (jVar != jVar2 && ((Integer) this.f375d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar == jVar2 && ((Integer) this.f375d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar == jVar2) {
            bg.a.a(new byte[0]);
        } else if (jVar == of.j.f12458d) {
            bg.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f375d).intValue()).array());
        } else {
            if (jVar != of.j.f12457c) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((of.k) this.f373b).f12476e);
            }
            bg.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f375d).intValue()).array());
        }
        return new of.i();
    }

    public of.m c() throws GeneralSecurityException {
        d8.e eVar;
        of.n nVar = (of.n) this.f373b;
        if (nVar == null || (eVar = (d8.e) this.f374c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (nVar.f12481b != ((bg.a) eVar.f5001a).f1773a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        of.j jVar = nVar.f12484e;
        of.j jVar2 = of.j.f12462h;
        if (jVar != jVar2 && ((Integer) this.f375d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar == jVar2 && ((Integer) this.f375d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar == jVar2) {
            bg.a.a(new byte[0]);
        } else if (jVar == of.j.f12461g) {
            bg.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f375d).intValue()).array());
        } else {
            if (jVar != of.j.f12460f) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((of.n) this.f373b).f12484e);
            }
            bg.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f375d).intValue()).array());
        }
        return new of.m();
    }

    public of.p d() throws GeneralSecurityException {
        d8.e eVar;
        of.q qVar = (of.q) this.f373b;
        if (qVar == null || (eVar = (d8.e) this.f374c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (qVar.f12489b != ((bg.a) eVar.f5001a).f1773a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        of.j jVar = qVar.f12490c;
        of.j jVar2 = of.j.f12464k;
        if (jVar != jVar2 && ((Integer) this.f375d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar == jVar2 && ((Integer) this.f375d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar == jVar2) {
            bg.a.a(new byte[0]);
        } else if (jVar == of.j.j) {
            bg.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f375d).intValue()).array());
        } else {
            if (jVar != of.j.f12463i) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((of.q) this.f373b).f12490c);
            }
            bg.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f375d).intValue()).array());
        }
        return new of.p();
    }

    public void e(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f373b;
        hh.f fVar = new hh.f(byteArrayOutputStream, map, (HashMap) this.f374c, (eh.d) this.f375d);
        if (obj == null) {
            return;
        }
        eh.d dVar = (eh.d) map.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new eh.b("No encoder for " + obj.getClass());
        }
    }

    public void f(Runnable runnable) {
        ((d8.h) this.f373b).execute(runnable);
    }

    public u h() {
        return ((e2.b) this.f375d).f5737a.f5735c;
    }

    public ColorStateList i(int i10) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f374c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateList = i4.c.getColorStateList((Context) this.f373b, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateList;
    }

    public n3.b j() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((ef.f) this.f375d)) {
            try {
                n3.b bVar = (n3.b) this.f374c;
                if (bVar != null && localeList == ((LocaleList) this.f373b)) {
                    return bVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(new n3.a(localeList.get(i10)));
                }
                n3.b bVar2 = new n3.b(arrayList);
                this.f373b = localeList;
                this.f374c = bVar2;
                return bVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public s3.c k() {
        return ((e2.b) this.f375d).f5737a.f5733a;
    }

    public Drawable l(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f374c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : u6.v.G((Context) this.f373b, resourceId);
    }

    public int m() {
        if (t().f6994a.isEmpty()) {
            return -1;
        }
        long j = ((g0.i) qi.l.z0(t().f6994a)).f6915a - t().f7001h;
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public Typeface n(int i10, int i11, y yVar) {
        int resourceId = ((TypedArray) this.f374c).getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f375d) == null) {
            this.f375d = new TypedValue();
        }
        Context context = (Context) this.f373b;
        TypedValue typedValue = (TypedValue) this.f375d;
        ThreadLocal threadLocal = k4.l.f9440a;
        if (context.isRestricted()) {
            return null;
        }
        return k4.l.b(context, resourceId, typedValue, i11, yVar, true, false);
    }

    public byte[] o() {
        HashMap map = (HashMap) this.f375d;
        URI uri = (URI) this.f373b;
        String path = uri.getPath();
        String query = uri.getQuery();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(path);
        sb2.append(query == null ? "" : "?".concat(query));
        String string = sb2.toString();
        String host = uri.getHost();
        if (uri.getPort() != -1) {
            host = host + ":" + uri.getPort();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", (String) this.f374c);
        for (String str : map.keySet()) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, (String) map.get(str));
            }
        }
        String strJ = m1.j("GET ", string, " HTTP/1.1\r\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strJ);
        String str2 = new String();
        for (String str3 : linkedHashMap.keySet()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(str3);
            sb4.append(": ");
            str2 = m6.a.j(sb4, (String) linkedHashMap.get(str3), "\r\n");
        }
        sb3.append(str2);
        byte[] bytes = m1.v(sb3.toString(), "\r\n").getBytes(Charset.defaultCharset());
        byte[] bArr = new byte[bytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        md.b bVar = (md.b) this.f373b;
        String str = (String) this.f374c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f375d;
        synchronized (bVar.f11603a) {
            bVar.f11603a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public boolean p() {
        return !t().f6994a.isEmpty();
    }

    public r0 q() {
        r0 r0Var = (r0) this.f374c;
        if (r0Var != null) {
            return r0Var;
        }
        fj.l.l("keyboardActions");
        throw null;
    }

    public int r() {
        if (t().f6994a.isEmpty()) {
            return -1;
        }
        long j = ((g0.i) qi.l.F0(t().f6994a)).f6915a + t().f7001h;
        long jA = A() - 1;
        if (j > jA) {
            j = jA;
        }
        return (int) j;
    }

    public s3.m s() {
        return ((e2.b) this.f375d).f5737a.f5734b;
    }

    public z t() {
        z zVar = (z) this.f374c;
        if (zVar != null) {
            return zVar;
        }
        fj.l.l("layoutInfo");
        throw null;
    }

    public String toString() {
        switch (this.f372a) {
            case 22:
                return nf.o.a((f1) this.f373b).toString();
            default:
                return super.toString();
        }
    }

    public int u() {
        if (t().f6994a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((g0.i) qi.l.F0(t().f6994a)).j + t().f6995b) + t().f6996c) - t().f7000g);
    }

    public int v() {
        if (t().f6994a.isEmpty()) {
            return 0;
        }
        int i10 = ((g0.i) qi.l.z0(t().f6994a)).j + (-t().f6999f);
        return Math.abs(i10 <= 0 ? i10 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(java.lang.Class r17) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.d.w(java.lang.Class):java.lang.Object");
    }

    public List x(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.f373b).get(new nf.l(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public long y() {
        return ((e2.b) this.f375d).f5737a.f5736d;
    }

    public c8.d z(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f373b;
        u6.z zVarG = u6.z.g(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            zVarG.R(1);
        } else {
            zVarG.k(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorN = u0.l.n(workDatabase_Impl, zVarG);
        try {
            return cursorN.moveToFirst() ? new c8.d(cursorN.getString(u0.c.m(cursorN, "work_spec_id")), cursorN.getInt(u0.c.m(cursorN, "system_id"))) : null;
        } finally {
            cursorN.close();
            zVarG.l();
        }
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.f372a = i10;
        this.f373b = obj;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10) {
        this.f372a = i10;
        this.f373b = obj;
        this.f374c = obj2;
        this.f375d = obj3;
    }

    public d(u1 u1Var) {
        this.f372a = 11;
        this.f373b = new p1.a(0);
        this.f374c = new ak.v(9);
        this.f375d = new s3(5, this, u1Var);
    }

    public d(WorkDatabase_Impl workDatabase_Impl) {
        this.f372a = 8;
        this.f373b = workDatabase_Impl;
        this.f374c = new c8.b(workDatabase_Impl, 2);
        this.f375d = new c8.e(workDatabase_Impl, 0);
    }

    public d(w wVar) {
        this.f372a = 5;
        this.f373b = new v(wVar, true);
        this.f374c = new Handler(Looper.getMainLooper());
    }

    public d(ExecutorService executorService) {
        this.f372a = 12;
        this.f374c = new Handler(Looper.getMainLooper());
        this.f375d = new f8.b(this, 0);
        this.f373b = new d8.h(executorService);
    }

    public d(ak.v vVar) {
        this.f372a = 4;
        this.f373b = vVar;
        this.f374c = new ConcurrentHashMap();
        this.f375d = new ConcurrentHashMap();
    }

    public d(cg.i iVar, ph.d dVar, ai.j jVar, ai.e eVar, Context context, ai.m mVar, ScheduledExecutorService scheduledExecutorService) {
        this.f372a = 3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f373b = linkedHashSet;
        this.f374c = new ai.p(iVar, dVar, jVar, eVar, context, linkedHashSet, mVar, scheduledExecutorService);
        this.f375d = scheduledExecutorService;
    }

    public d(byte[] bArr) throws GeneralSecurityException {
        this.f372a = 1;
        ag.q.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f373b = secretKeySpec;
        if (gk.b.a(1)) {
            Cipher cipher = (Cipher) ag.k.f450b.f452a.q("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] bArrF = u1.p.f(cipher.doFinal(new byte[16]));
            this.f374c = bArrF;
            this.f375d = u1.p.f(bArrF);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public d(View view) {
        this.f372a = 18;
        this.f373b = view;
        this.f374c = u6.v.P(pi.f.f12998b, new f0(this, 5));
        this.f375d = new p7.k(view);
    }

    public d(t0.j jVar, p1.l lVar) {
        this.f372a = 24;
        this.f375d = jVar;
        this.f374c = lVar;
        ug.b bVar = new ug.b(this, new h6.b(this));
        this.f373b = bVar;
        bVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    public d(e2.b bVar) {
        this.f372a = 9;
        this.f375d = bVar;
        this.f373b = new ld.i(this, 6);
    }

    public d(Context context, TypedArray typedArray) {
        this.f372a = 19;
        this.f373b = context;
        this.f374c = typedArray;
    }

    public d(a4.e eVar) {
        this.f372a = 6;
        this.f373b = new ArrayList();
        this.f374c = new b4.b();
        this.f375d = eVar;
    }

    public d(Context context) {
        this.f372a = 14;
        this.f373b = context.getApplicationContext();
        this.f374c = r8.e.f13845o;
        this.f375d = new h8.h();
    }

    public d(e0 e0Var, d dVar) {
        this.f372a = 25;
        this.f373b = e0Var;
        this.f374c = dVar;
        this.f375d = e0Var.getValue();
    }

    public d(ConcurrentMap concurrentMap, nf.k kVar, xf.a aVar, Class cls) {
        this.f372a = 23;
        this.f373b = concurrentMap;
        this.f374c = kVar;
        this.f375d = aVar;
    }

    public d(int i10) {
        this.f372a = i10;
        switch (i10) {
            case 17:
                this.f373b = new r(16);
                long[] jArr = q.n0.f13108a;
                this.f374c = new g0();
                this.f375d = new ef.f();
                break;
            case zzbch.zzt.zzm /* 21 */:
                this.f375d = new ef.f();
                break;
            case 26:
                this.f373b = new WeakHashMap();
                this.f374c = new WeakHashMap();
                this.f375d = new WeakHashMap();
                break;
            default:
                long[] jArr2 = q.n0.f13108a;
                this.f373b = new g0();
                break;
        }
    }

    public d(f1 f1Var, List list) {
        this.f372a = 22;
        this.f373b = f1Var;
        this.f374c = list;
        this.f375d = xf.a.f20046b;
    }
}
