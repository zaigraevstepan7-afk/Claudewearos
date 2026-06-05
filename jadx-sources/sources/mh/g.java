package mh;

import ak.p;
import ak.v;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.k;
import androidx.lifecycle.x0;
import androidx.lifecycle.z0;
import androidx.work.impl.WorkDatabase_Impl;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzacl;
import com.google.android.gms.internal.p002firebaseauthapi.zzafn;
import com.google.android.gms.internal.p002firebaseauthapi.zzah;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import f0.a0;
import f0.a1;
import f1.v0;
import fj.l;
import h8.j;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import jg.n;
import jg.t;
import org.json.JSONException;
import org.json.JSONObject;
import q.b0;
import q.d0;
import q.g0;
import q.k0;
import q.r;
import q.r0;
import rg.c0;
import t.m1;
import t2.r1;
import u6.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g implements r1, z0, t8.a, OnCompleteListener, Continuation, c0 {

    /* renamed from: d, reason: collision with root package name */
    public static g f11705d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11706a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11707b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11708c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f11706a = i10;
        this.f11707b = obj;
        this.f11708c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static mh.g h(android.content.Context r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2c java.io.IOException -> L2e
            mh.g r2 = new mh.g     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 28
            r2.<init>(r3, r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L38
        L25:
            r2 = move-exception
            goto L38
        L27:
            r2 = move-exception
            goto L38
        L29:
            r2 = move-exception
        L2a:
            r0 = r1
            goto L38
        L2c:
            r2 = move-exception
            goto L2a
        L2e:
            r2 = move-exception
            goto L2a
        L30:
            r2 = move-exception
        L31:
            r5 = r1
            r0 = r5
            goto L38
        L34:
            r2 = move-exception
            goto L31
        L36:
            r2 = move-exception
            goto L31
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.g.h(android.content.Context):mh.g");
    }

    public static String j(String str) {
        return m6.a.j(new StringBuilder(String.valueOf(str).length() + 6), str, "|S|cre");
    }

    public static String k(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(str2).length() + str3.length());
        m1.s(sb2, str, "|T|", str2, "|");
        sb2.append(str3);
        return sb2.toString();
    }

    public static synchronized g m() {
        try {
            if (f11705d == null) {
                g gVar = new g(0, false);
                gVar.f11707b = null;
                gVar.f11708c = null;
                f11705d = gVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f11705d;
    }

    public void A() throws IOException {
        try {
            ((FileLock) this.f11708c).release();
            ((FileChannel) this.f11707b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(cl.a r13, ak.v r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.g.B(cl.a, ak.v, boolean):java.lang.Object");
    }

    public void C() throws NoSuchMethodException, SecurityException {
        if (!((c7.b) this.f11707b).f3107h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a7.a aVar = (a7.a) this.f11708c;
        if (aVar == null) {
            aVar = new a7.a(this);
        }
        this.f11708c = aVar;
        try {
            k.class.getDeclaredConstructor(null);
            a7.a aVar2 = (a7.a) this.f11708c;
            if (aVar2 != null) {
                aVar2.f189a.add(k.class.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public synchronized void D(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strJ = j(str);
        SharedPreferences sharedPreferences = (SharedPreferences) this.f11707b;
        if (sharedPreferences.contains(strJ)) {
            String string = sharedPreferences.getString(j(str), null);
            if (string != null) {
                try {
                    jCurrentTimeMillis = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            } else {
                jCurrentTimeMillis = 0;
            }
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(j(str), String.valueOf(jCurrentTimeMillis));
        editorEdit.commit();
        ((q.e) this.f11708c).put(str, Long.valueOf(jCurrentTimeMillis));
    }

    public void E(v0 v0Var) {
        Object objG = ((g0) this.f11708c).g(v0Var);
        if (objG != null) {
            if (!(objG instanceof b0)) {
                throw new ClassCastException();
            }
            b0 b0Var = (b0) objG;
            Object[] objArr = b0Var.f13033a;
            if (b0Var.f13034b <= 0) {
                return;
            }
            l.d(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    @Override // t2.r1
    public boolean b(Object obj, Object obj2) {
        a0 a0Var = (a0) this.f11707b;
        return l.b(a0Var.b(obj), a0Var.b(obj2));
    }

    @Override // t2.r1
    public void d(r0 r0Var) {
        q.a0 a0Var = (q.a0) this.f11708c;
        a0Var.a();
        d0 d0Var = (d0) r0Var.f13125b;
        Object[] objArr = d0Var.f13048b;
        long[] jArr = d0Var.f13049c;
        int i10 = d0Var.f13051e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & 2147483647L);
            Object obj = objArr[i10];
            Object objB = ((a0) this.f11707b).b(obj);
            int iD = a0Var.d(objB);
            int i12 = iD >= 0 ? a0Var.f13028c[iD] : 0;
            if (i12 == 7) {
                r0Var.remove(obj);
            } else {
                a0Var.g(i12 + 1, objB);
            }
            i10 = i11;
        }
    }

    @Override // androidx.lifecycle.z0
    public x0 e(fj.f fVar, d6.c cVar) throws a5.a {
        gl.a aVar = new gl.a(cVar);
        v vVar = ((cl.a) this.f11708c).f3393e;
        d8.e eVar = (d8.e) vVar.f734e;
        l.f(eVar, "<this>");
        Object obj = ((HashMap) eVar.f5001a).get(xk.a.f20114a);
        if (obj == null) {
            obj = null;
        }
        if (!l.b(obj, Boolean.TRUE)) {
            return (x0) ((cl.a) this.f11708c).a((fj.f) this.f11707b, aVar);
        }
        String str = fVar.c() + '-' + mk.b.s();
        zk.c cVar2 = new zk.c(fVar);
        zk.c cVar3 = hl.a.f8046a;
        l.f(str, "scopeId");
        al.a aVar2 = (al.a) vVar.f732c;
        ConcurrentHashMap concurrentHashMap = aVar2.f767c;
        ef.f fVar2 = (ef.f) aVar2.f765a.f730a;
        fVar2.e("| (+) Scope - id:'" + str + "' q:'" + cVar2 + '\'');
        Set set = aVar2.f766b;
        if (!set.contains(cVar2)) {
            fVar2.e("| Scope '" + cVar2 + "' not defined. Creating it ...");
            set.add(cVar2);
        }
        if (concurrentHashMap.containsKey(str)) {
            String str2 = "Scope with id '" + str + "' is already created";
            l.f(str2, "s");
            throw new a5.a(str2);
        }
        cl.a aVar3 = new cl.a(cVar2, str, cVar3, aVar2.f765a, 4);
        cl.a[] aVarArr = {aVar2.f768d};
        if (aVar3.f3391c) {
            throw new IllegalStateException("Can't add scope link to a root scope");
        }
        aVar3.f3394f.addAll(0, qi.k.v0(aVarArr));
        concurrentHashMap.put(str, aVar3);
        x0 x0Var = (x0) aVar3.a((fj.f) this.f11707b, aVar);
        gl.b bVar = new gl.b(str, vVar);
        f6.b bVar2 = x0Var.f1156a;
        if (bVar2 == null) {
            return x0Var;
        }
        if (bVar2.f6648d) {
            f6.b.a(bVar);
            return x0Var;
        }
        synchronized (bVar2.f6645a) {
            bVar2.f6647c.add(bVar);
        }
        return x0Var;
    }

    @Override // rg.c0
    public void f(boolean z2, q5.b bVar) {
        jg.a aVar = (jg.a) ((AtomicReference) this.f11708c).get();
        if (aVar != null) {
            ((FirebaseAuth) aVar).a(z2).addOnSuccessListener(new ng.b(bVar)).addOnFailureListener(new ng.b(bVar));
        } else {
            bVar.u(null);
        }
    }

    @Override // t8.a
    public void g(j jVar) {
        i8.i iVar = (i8.i) this.f11708c;
        i8.i.k(iVar, new i8.f(jVar != null ? i8.k.c(jVar, ((r8.g) this.f11707b).f13868a, iVar.H) : null));
    }

    public Bundle i(String str) {
        l.f(str, "key");
        c7.b bVar = (c7.b) this.f11707b;
        if (!bVar.f3106g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = bVar.f3105f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleI = bundle.containsKey(str) ? u6.v.I(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            bVar.f3105f = null;
        }
        return bundleI;
    }

    public synchronized void l() {
        ((q.e) this.f11708c).clear();
        ((SharedPreferences) this.f11707b).edit().clear().commit();
    }

    public Long n(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f11707b;
        z zVarG = z.g(1, "SELECT long_value FROM Preference where `key`=?");
        zVarG.k(1, str);
        workDatabase_Impl.b();
        Cursor cursorN = u0.l.n(workDatabase_Impl, zVarG);
        try {
            Long lValueOf = null;
            if (cursorN.moveToFirst() && !cursorN.isNull(0)) {
                lValueOf = Long.valueOf(cursorN.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorN.close();
            zVarG.l();
        }
    }

    public kj.h o() {
        Matcher matcher = (Matcher) this.f11707b;
        return cg.b.T(matcher.start(), matcher.end());
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f11706a) {
            case 15:
                GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.f11707b;
                String str = (String) this.f11708c;
                if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
                    Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    zzacl.zzb(genericIdpActivity, str);
                    return;
                }
                List<ResolveInfo> listQueryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                    Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent.putExtra("com.android.browser.application_id", str);
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                    intent.addFlags(1073741824);
                    intent.addFlags(268435456);
                    genericIdpActivity.startActivity(intent);
                    return;
                }
                t0.j jVarA = new a1(3).a();
                Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                Uri uri = (Uri) task.getResult();
                Intent intent2 = (Intent) jVarA.f15363b;
                intent2.setData(uri);
                i4.c.startActivity(genericIdpActivity, intent2, (Bundle) jVarA.f15364c);
                return;
            default:
                kf.e eVar = (kf.e) this.f11707b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f11708c;
                synchronized (eVar.f9565f) {
                    eVar.f9564e.remove(taskCompletionSource);
                }
                return;
        }
    }

    public a7.d p(String str) {
        a7.d dVar;
        c7.b bVar = (c7.b) this.f11707b;
        synchronized (bVar.f3102c) {
            Iterator it = bVar.f3103d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                a7.d dVar2 = (a7.d) entry.getValue();
                if (l.b(str2, str)) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public String q(String str) {
        String str2 = (String) this.f11708c;
        Resources resources = (Resources) this.f11707b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public ArrayList r(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f11707b;
        z zVarG = z.g(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            zVarG.R(1);
        } else {
            zVarG.k(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorN = u0.l.n(workDatabase_Impl, zVarG);
        try {
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                arrayList.add(cursorN.getString(0));
            }
            return arrayList;
        } finally {
            cursorN.close();
            zVarG.l();
        }
    }

    public boolean s(Context context) {
        if (((Boolean) this.f11708c) == null) {
            this.f11708c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f11707b).booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f11708c).booleanValue();
    }

    public boolean t(Context context) {
        if (((Boolean) this.f11707b) == null) {
            this.f11707b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f11707b).booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f11707b).booleanValue();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Bundle bundle;
        switch (this.f11706a) {
            case 16:
                v vVar = (v) this.f11708c;
                String str = (String) this.f11707b;
                if (!task.isSuccessful()) {
                    Exception exception = task.getException();
                    e0.i(exception);
                    String message = exception.getMessage();
                    e0.i(message);
                    return Tasks.forException(new n(message));
                }
                zzafn zzafnVar = (zzafn) task.getResult();
                String strZza = zzafnVar.zza();
                if (zzah.zzc(strZza)) {
                    return Tasks.forException(new n(m1.i("No Recaptcha Enterprise siteKey configured for tenant/project ", str)));
                }
                List<String> listZza = zzac.zza('/').zza((CharSequence) strZza);
                String str2 = listZza.size() != 4 ? null : listZza.get(3);
                if (TextUtils.isEmpty(str2)) {
                    return Tasks.forException(new Exception(m1.i("Invalid siteKey format ", strZza)));
                }
                if (Log.isLoggable("RecaptchaHandler", 4)) {
                    Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + str);
                }
                vVar.f731b = zzafnVar;
                t tVar = (t) vVar.f734e;
                cg.i iVar = (cg.i) vVar.f732c;
                iVar.b();
                Application application = (Application) iVar.f3367a;
                tVar.getClass();
                Task<RecaptchaTasksClient> tasksClient = Recaptcha.getTasksClient(application, str2);
                ((HashMap) vVar.f730a).put(str, tasksClient);
                return tasksClient;
            case 22:
                md.b bVar = (md.b) this.f11707b;
                Bundle bundle2 = (Bundle) this.f11708c;
                bVar.getClass();
                return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? bVar.b(bundle2).onSuccessTask(md.h.f11618c, md.d.f11613d) : task;
            default:
                t0.j jVar = (t0.j) this.f11707b;
                Pair pair = (Pair) this.f11708c;
                synchronized (jVar) {
                    ((q.e) jVar.f15364c).remove(pair);
                }
                return task;
        }
    }

    public void u(c8.c cVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f11707b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((c8.b) this.f11708c).l(cVar);
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.h();
        }
    }

    public void v(IOException iOException) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f11707b;
        if (iOException instanceof InterruptedIOException) {
            jh.d dVar = jh.d.f8942a;
            taskCompletionSource.setException(new jh.e("DEADLINE_EXCEEDED", iOException));
        } else {
            jh.d dVar2 = jh.d.f8942a;
            taskCompletionSource.setException(new jh.e("INTERNAL", iOException));
        }
    }

    public void w(ak.z zVar) throws Exception {
        jh.d dVarValueOf;
        Charset charsetForName;
        Object objOpt;
        p9.a aVar = ((jh.c) this.f11708c).f8936b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f11707b;
        int i10 = zVar.f759c;
        if (i10 == 200) {
            dVarValueOf = jh.d.f8942a;
        } else if (i10 == 409) {
            dVarValueOf = jh.d.B;
        } else if (i10 == 429) {
            dVarValueOf = jh.d.A;
        } else if (i10 == 400) {
            dVarValueOf = jh.d.f8945d;
        } else if (i10 == 401) {
            dVarValueOf = jh.d.F;
        } else if (i10 == 403) {
            dVarValueOf = jh.d.f8948z;
        } else if (i10 == 404) {
            dVarValueOf = jh.d.f8947f;
        } else if (i10 == 503) {
            dVarValueOf = jh.d.E;
        } else if (i10 != 504) {
            switch (i10) {
                case 499:
                    dVarValueOf = jh.d.f8943b;
                    break;
                case 500:
                    dVarValueOf = jh.d.D;
                    break;
                case 501:
                    dVarValueOf = jh.d.C;
                    break;
                default:
                    dVarValueOf = jh.d.f8944c;
                    break;
            }
        } else {
            dVarValueOf = jh.d.f8946e;
        }
        ak.b0 b0Var = zVar.f763z;
        kk.h hVarL = b0Var.l();
        try {
            p pVarG = b0Var.g();
            if (pVarG != null) {
                charsetForName = StandardCharsets.UTF_8;
                try {
                    String str = pVarG.f685b;
                    if (str != null) {
                        charsetForName = Charset.forName(str);
                    }
                } catch (IllegalArgumentException unused) {
                }
            } else {
                charsetForName = StandardCharsets.UTF_8;
            }
            int iU = hVarL.U(bk.d.f1789e);
            if (iU != -1) {
                if (iU == 0) {
                    charsetForName = StandardCharsets.UTF_8;
                } else if (iU == 1) {
                    charsetForName = StandardCharsets.UTF_16BE;
                } else if (iU == 2) {
                    charsetForName = StandardCharsets.UTF_16LE;
                } else if (iU == 3) {
                    charsetForName = bk.d.f1790f;
                } else {
                    if (iU != 4) {
                        throw new AssertionError();
                    }
                    charsetForName = bk.d.f1791g;
                }
            }
            String strI = hVarL.I(charsetForName);
            ak.b0.b(null, hVarL);
            int i11 = jh.e.f8949b;
            String strName = dVarValueOf.name();
            try {
                JSONObject jSONObject = new JSONObject(strI).getJSONObject("error");
                if (jSONObject.opt("status") instanceof String) {
                    dVarValueOf = jh.d.valueOf(jSONObject.getString("status"));
                    strName = dVarValueOf.name();
                }
                if ((jSONObject.opt("message") instanceof String) && !jSONObject.getString("message").isEmpty()) {
                    strName = jSONObject.getString("message");
                }
                objOpt = jSONObject.opt("details");
                if (objOpt != null) {
                    try {
                        aVar.getClass();
                        objOpt = p9.a.e(objOpt);
                    } catch (IllegalArgumentException unused2) {
                        dVarValueOf = jh.d.D;
                        strName = "INTERNAL";
                    } catch (JSONException unused3) {
                    }
                }
            } catch (IllegalArgumentException unused4) {
                objOpt = null;
            } catch (JSONException unused5) {
                objOpt = null;
            }
            jh.e eVar = dVarValueOf == jh.d.f8942a ? null : new jh.e(objOpt, strName);
            if (eVar != null) {
                taskCompletionSource.setException(eVar);
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(strI);
                Object objOpt2 = jSONObject2.opt("data");
                if (objOpt2 == null) {
                    objOpt2 = jSONObject2.opt("result");
                }
                if (objOpt2 == null) {
                    taskCompletionSource.setException(new jh.e(null, "Response is missing data field."));
                    return;
                }
                aVar.getClass();
                p9.a.e(objOpt2);
                taskCompletionSource.setResult(new jh.j());
            } catch (JSONException e10) {
                jh.d dVar = jh.d.f8942a;
                taskCompletionSource.setException(new jh.e("Response is not valid JSON object.", e10));
            }
        } finally {
        }
    }

    public void x(q4.f fVar) {
        com.google.android.gms.common.api.internal.e0 e0Var = (com.google.android.gms.common.api.internal.e0) this.f11708c;
        ld.i iVar = (ld.i) this.f11707b;
        int i10 = fVar.f13221b;
        if (i10 != 0) {
            e0Var.execute(new b8.f(i10, 3, iVar));
        } else {
            e0Var.execute(new a8.e(18, iVar, fVar.f13220a, false));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0205, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105 A[Catch: IOException -> 0x008d, XmlPullParserException -> 0x0090, TryCatch #2 {IOException -> 0x008d, XmlPullParserException -> 0x0090, blocks: (B:19:0x005e, B:96:0x0205, B:27:0x0070, B:28:0x007e, B:30:0x0083, B:37:0x0093, B:45:0x00ad, B:40:0x009c, B:43:0x00a5, B:46:0x00bb, B:50:0x00ca, B:52:0x00d2, B:53:0x00dc, B:62:0x0105, B:63:0x010c, B:64:0x0124, B:56:0x00e5, B:58:0x00ed, B:59:0x00fb, B:65:0x0125, B:67:0x012d, B:68:0x013b, B:71:0x0145, B:72:0x0150, B:73:0x0168, B:74:0x0169, B:77:0x0173, B:78:0x017e, B:79:0x0196, B:80:0x0197, B:82:0x019f, B:83:0x01a8, B:86:0x01b2, B:87:0x01bc, B:88:0x01d4, B:89:0x01d5, B:92:0x01df, B:93:0x01e9, B:94:0x0201, B:95:0x0202), top: B:104:0x005e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.g.y(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void z(String str, a7.d dVar) {
        l.f(dVar, "provider");
        c7.b bVar = (c7.b) this.f11707b;
        synchronized (bVar.f3102c) {
            if (bVar.f3103d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            bVar.f3103d.put(str, dVar);
        }
    }

    public /* synthetic */ g(int i10, Object obj, Object obj2, boolean z2) {
        this.f11706a = i10;
        this.f11707b = obj2;
        this.f11708c = obj;
    }

    public /* synthetic */ g(int i10, boolean z2) {
        this.f11706a = i10;
    }

    public g(Context context, int i10) {
        boolean zIsEmpty;
        this.f11706a = i10;
        switch (i10) {
            case 20:
                this.f11707b = new ArrayList();
                this.f11708c = context.getApplicationContext();
                return;
            case 24:
                this.f11708c = new q.e(0);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                this.f11707b = sharedPreferences;
                File file = new File(i4.c.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
                if (file.exists()) {
                    return;
                }
                try {
                    if (file.createNewFile()) {
                        synchronized (this) {
                            zIsEmpty = sharedPreferences.getAll().isEmpty();
                        }
                        if (zIsEmpty) {
                            return;
                        }
                        Log.i("FirebaseInstanceId", "App restored, clearing state");
                        l();
                        return;
                    }
                    return;
                } catch (IOException e10) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String strValueOf = String.valueOf(e10.getMessage());
                        Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new String("Error creating file in no backup dir: "));
                        return;
                    }
                    return;
                }
            default:
                e0.i(context);
                Resources resources = context.getResources();
                this.f11707b = resources;
                this.f11708c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                return;
        }
    }

    public g(String str) {
        this.f11706a = 7;
        this.f11707b = "LibraryVersion";
        this.f11708c = (str == null || str.length() <= 0) ? null : str;
    }

    public g(WorkDatabase_Impl workDatabase_Impl, int i10) {
        this.f11706a = i10;
        switch (i10) {
            case 6:
                this.f11707b = workDatabase_Impl;
                this.f11708c = new c8.b(workDatabase_Impl, 6);
                break;
            default:
                this.f11707b = workDatabase_Impl;
                this.f11708c = new c8.b(workDatabase_Impl, 1);
                break;
        }
    }

    public g(c7.b bVar) {
        this.f11706a = 1;
        this.f11707b = bVar;
    }

    public g(kg.p pVar) {
        this.f11706a = 25;
        this.f11707b = pVar;
        this.f11708c = new AtomicReference();
        pVar.a(new ac.h(this, 23));
    }

    public g(v vVar) {
        this.f11706a = 4;
        this.f11707b = vVar;
        this.f11708c = new ArrayList();
    }

    public g(a0 a0Var) {
        this.f11706a = 10;
        this.f11707b = a0Var;
        q.a0 a0Var2 = k0.f13101a;
        this.f11708c = new q.a0();
    }

    public g(int i10) {
        this.f11706a = i10;
        switch (i10) {
            case 11:
                this.f11707b = new g0();
                this.f11708c = new g0();
                break;
            case 18:
                this.f11707b = new ef.f();
                this.f11708c = new r(16);
                break;
            default:
                this.f11707b = new LinkedHashMap();
                this.f11708c = new LinkedHashMap();
                break;
        }
    }
}
