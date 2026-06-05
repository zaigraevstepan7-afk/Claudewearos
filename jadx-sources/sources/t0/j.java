package t0;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.lifecycle.b0;
import androidx.work.impl.WorkDatabase_Impl;
import c1.r3;
import c1.z2;
import com.google.android.gms.internal.ads.zzaqf;
import com.google.android.gms.internal.ads.zzaqk;
import com.google.android.gms.internal.p002firebaseauthapi.zzacl;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.internal.p002firebaseauthapi.zzaft;
import com.google.android.gms.internal.p002firebaseauthapi.zzxy;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.RecaptchaActivity;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import f0.a1;
import g3.e0;
import g3.m0;
import j1.k0;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import jg.y;
import l3.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q.q0;
import qc.l0;
import qc.w;
import qj.s1;
import rg.c0;
import t.m1;
import t.p1;
import u6.v;
import u6.z;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j implements wb.b, f1.g, i3.d, k0, OnCompleteListener, OnSuccessListener, c0, zzaqf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15362a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15363b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15364c;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.f15362a = i10;
        this.f15363b = obj;
        this.f15364c = obj2;
    }

    @Override // i3.d
    public int a(int i10) {
        CharSequence charSequence = (CharSequence) this.f15363b;
        do {
            i10 = ((hf.p) this.f15364c).i(i10);
            if (i10 == -1 || i10 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i10)));
        return i10;
    }

    @Override // i3.d
    public int b(int i10) {
        do {
            i10 = ((hf.p) this.f15364c).j(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f15363b).charAt(i10 - 1)));
        return i10;
    }

    @Override // j1.k0
    public List c(Integer num) {
        List listC = ((k0) this.f15363b).c(null);
        i1.k kVar = (i1.k) this.f15364c;
        int i10 = kVar.f8156v;
        return i10 < 0 ? listC : qi.l.I0(u1.b.i(kVar, num, i10, Integer.valueOf(kVar.E(kVar.f8137b, i10))), listC);
    }

    @Override // f1.g
    public void cancel() {
        if (((p1.a) this.f15364c).compareAndSet(1, 1)) {
            return;
        }
        ((r3) this.f15363b).a();
    }

    @Override // i3.d
    public int d(int i10) {
        do {
            i10 = ((hf.p) this.f15364c).j(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f15363b).charAt(i10)));
        return i10;
    }

    @Override // i3.d
    public int e(int i10) {
        do {
            i10 = ((hf.p) this.f15364c).i(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f15363b).charAt(i10 - 1)));
        return i10;
    }

    @Override // rg.c0
    public void f(boolean z2, q5.b bVar) {
        if (((AtomicReference) this.f15364c).get() != null) {
            throw new ClassCastException();
        }
        bVar.u(null);
    }

    public void g(Object obj, String str) {
        ((ArrayList) this.f15363b).add(m1.w(str, "=", String.valueOf(obj)));
    }

    @Override // oi.a
    public Object get() {
        y9.a aVar = new y9.a();
        x9.b bVar = new x9.b(4);
        Object obj = ((oi.a) this.f15363b).get();
        oi.a aVar2 = (oi.a) this.f15364c;
        return new bc.h(aVar, bVar, bc.a.f1722f, (bc.j) obj, aVar2);
    }

    @Override // j1.k0
    public boolean h() {
        return ((k0) this.f15363b).h();
    }

    public t i(List list) {
        l3.g gVar;
        Exception e10;
        l3.g gVar2;
        try {
            int size = list.size();
            int i10 = 0;
            gVar = null;
            while (i10 < size) {
                try {
                    gVar2 = (l3.g) list.get(i10);
                } catch (Exception e11) {
                    e10 = e11;
                }
                try {
                    gVar2.a((com.google.android.material.datepicker.o) this.f15364c);
                    i10++;
                    gVar = gVar2;
                } catch (Exception e12) {
                    e10 = e12;
                    gVar = gVar2;
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder sb3 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb3.append(((hf.p) ((com.google.android.material.datepicker.o) this.f15364c).f3880f).b());
                    sb3.append(", composition=");
                    sb3.append(((com.google.android.material.datepicker.o) this.f15364c).c());
                    sb3.append(", selection=");
                    com.google.android.material.datepicker.o oVar = (com.google.android.material.datepicker.o) this.f15364c;
                    sb3.append((Object) m0.h(e0.b(oVar.f3876b, oVar.f3877c)));
                    sb3.append("):");
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    qi.l.D0(list, sb2, "\n", new ab.k(23, gVar, this), 60);
                    throw new RuntimeException(sb2.toString(), e10);
                }
            }
            com.google.android.material.datepicker.o oVar2 = (com.google.android.material.datepicker.o) this.f15364c;
            oVar2.getClass();
            g3.f fVar = new g3.f(((hf.p) oVar2.f3880f).toString());
            com.google.android.material.datepicker.o oVar3 = (com.google.android.material.datepicker.o) this.f15364c;
            long jB = e0.b(oVar3.f3876b, oVar3.f3877c);
            m0 m0Var = m0.g(((t) this.f15363b).f9938b) ? null : new m0(jB);
            t tVar = new t(fVar, m0Var != null ? m0Var.f7145a : e0.b(m0.e(jB), m0.f(jB)), ((com.google.android.material.datepicker.o) this.f15364c).c());
            this.f15363b = tVar;
            return tVar;
        } catch (Exception e13) {
            gVar = null;
            e10 = e13;
        }
    }

    public void j(String str, PrintWriter printWriter) {
        g6.d dVar = (g6.d) this.f15364c;
        if (dVar.f7221b.f13123c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i10 = 0;
        while (true) {
            q0 q0Var = dVar.f7221b;
            if (i10 >= q0Var.f13123c) {
                return;
            }
            g6.a aVar = (g6.a) q0Var.e(i10);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(dVar.f7221b.f13121a[i10]);
            printWriter.print(": ");
            printWriter.println(aVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(aVar.f7213l);
            ld.d dVar2 = aVar.f7213l;
            String str3 = str2 + "  ";
            dVar2.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(dVar2.f10908a);
            if (dVar2.f10909b || dVar2.f10912e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(dVar2.f10909b);
                printWriter.print(" mContentChanged=");
                printWriter.print(dVar2.f10912e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (dVar2.f10910c || dVar2.f10911d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(dVar2.f10910c);
                printWriter.print(" mReset=");
                printWriter.println(dVar2.f10911d);
            }
            if (dVar2.f10914g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(dVar2.f10914g);
                printWriter.print(" waiting=");
                dVar2.f10914g.getClass();
                printWriter.println(false);
            }
            if (dVar2.f10915h != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(dVar2.f10915h);
                printWriter.print(" waiting=");
                dVar2.f10915h.getClass();
                printWriter.println(false);
            }
            if (aVar.f7215n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(aVar.f7215n);
                g6.b bVar = aVar.f7215n;
                bVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(bVar.f7217b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            ld.d dVar3 = aVar.f7213l;
            Object obj = aVar.f1069e;
            Object obj2 = obj != b0.f1064k ? obj : null;
            dVar3.getClass();
            StringBuilder sb2 = new StringBuilder(64);
            v.k(sb2, obj2);
            sb2.append("}");
            printWriter.println(sb2.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(aVar.f1067c > 0);
            i10++;
        }
    }

    public di.d k(ai.g gVar) throws JSONException, zh.c {
        String string;
        JSONArray jSONArray = gVar.f522g;
        long j = gVar.f521f;
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                ai.g gVarC = ((ai.e) this.f15363b).c();
                String string3 = null;
                if (gVarC == null) {
                    string = null;
                } else {
                    try {
                        string = gVarC.f517b.getString(strOptString);
                    } catch (JSONException unused) {
                    }
                }
                if (string == null) {
                    ai.g gVarC2 = ((ai.e) this.f15364c).c();
                    if (gVarC2 != null) {
                        try {
                            string3 = gVarC2.f517b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i11 = di.e.f5143a;
                di.b bVar = new di.b();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                bVar.f5131a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                bVar.f5132b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                bVar.f5133c = strOptString;
                bVar.f5134d = string;
                bVar.f5135e = j;
                bVar.f5136f = (byte) (bVar.f5136f | 1);
                hashSet.add(bVar.a());
            } catch (JSONException e10) {
                throw new zh.c("Exception parsing rollouts metadata to create RolloutsState.", e10);
            }
        }
        return new di.d(hashSet);
    }

    public ArrayList l(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f15363b;
        z zVarG = z.g(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pi.e] */
    public InputMethodManager m() {
        return (InputMethodManager) this.f15364c.getValue();
    }

    public KeyListener n(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((qh.c) ((yh.c) this.f15364c).f20314b).getClass();
        if (keyListener instanceof t5.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new t5.e(keyListener);
    }

    public void o(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f15363b).getContext().obtainStyledAttributes(attributeSet, i.a.f8053g, i10, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            u(z2);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.f15363b;
        String str = (String) this.f15364c;
        if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            zzacl.zzb(recaptchaActivity, str);
            return;
        }
        List<ResolveInfo> listQueryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent.putExtra("com.android.browser.application_id", str);
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            recaptchaActivity.startActivity(intent);
            return;
        }
        j jVarA = new a1(3).a();
        Intent intent2 = (Intent) jVarA.f15363b;
        intent2.addFlags(1073741824);
        intent2.addFlags(268435456);
        intent2.setData((Uri) task.getResult());
        i4.c.startActivity(recaptchaActivity, intent2, (Bundle) jVarA.f15364c);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.f15363b;
        mh.h hVar = (mh.h) this.f15364c;
        String str = ((mh.c) obj).f11693a;
        if (hVar == null || !str.equals(hVar.f11711a)) {
            ArrayList arrayList = firebaseInstanceId.f4286h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                FirebaseMessaging firebaseMessaging = ((wh.k) obj2).f19361a;
                w8.h hVar2 = FirebaseMessaging.f4290m;
                firebaseMessaging.f(str);
            }
        }
    }

    public t5.b p(InputConnection inputConnection, EditorInfo editorInfo) {
        yh.c cVar = (yh.c) this.f15364c;
        if (inputConnection == null) {
            cVar.getClass();
            inputConnection = null;
        } else {
            qh.c cVar2 = (qh.c) cVar.f20314b;
            cVar2.getClass();
            if (!(inputConnection instanceof t5.b)) {
                inputConnection = new t5.b((EditText) cVar2.f13507b, inputConnection, editorInfo);
            }
        }
        return (t5.b) inputConnection;
    }

    public void q(ah.f fVar) {
        ((pg.v) this.f15364c).f12966i.execute(new a8.e(17, this, fVar));
    }

    public void r(Bundle bundle) {
        c7.b bVar = (c7.b) this.f15363b;
        a7.f fVar = bVar.f3100a;
        if (!bVar.f3104e) {
            bVar.a();
        }
        if (fVar.h().f1141c.compareTo(androidx.lifecycle.o.f1114d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + fVar.h().f1141c).toString());
        }
        if (bVar.f3106g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleI = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleI = v.I(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        bVar.f3105f = bundleI;
        bVar.f3106g = true;
    }

    public void s(Bundle bundle) {
        c7.b bVar = (c7.b) this.f15363b;
        Bundle bundleM = uk.c.m((pi.h[]) Arrays.copyOf(new pi.h[0], 0));
        Bundle bundle2 = bVar.f3105f;
        if (bundle2 != null) {
            bundleM.putAll(bundle2);
        }
        synchronized (bVar.f3102c) {
            for (Map.Entry entry : bVar.f3103d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((a7.d) entry.getValue()).a();
                fj.l.f(str, "key");
                bundleM.putBundle(str, bundleA);
            }
        }
        if (bundleM.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM);
    }

    public void t(String str) {
        ah.e eVar = (ah.e) this.f15363b;
        synchronized (eVar) {
            eVar.e((byte) 1, str.getBytes(ah.e.f464m));
        }
    }

    public String toString() {
        switch (this.f15362a) {
            case 7:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f15364c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f15363b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 12:
                StringBuilder sb3 = new StringBuilder(128);
                sb3.append("LoaderManager{");
                sb3.append(Integer.toHexString(System.identityHashCode(this)));
                sb3.append(" in ");
                v.k(sb3, (androidx.lifecycle.t) this.f15363b);
                sb3.append("}}");
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public void u(boolean z2) {
        t5.i iVar = (t5.i) ((qh.c) ((yh.c) this.f15364c).f20314b).f13508c;
        if (iVar.f15817c != z2) {
            if (iVar.f15816b != null) {
                r5.k kVarA = r5.k.a();
                t5.h hVar = iVar.f15816b;
                kVarA.getClass();
                uk.c.p(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = kVarA.f13734a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    kVarA.f13735b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f15817c = z2;
            if (z2) {
                t5.i.a(iVar.f15815a, r5.k.a().c());
            }
        }
    }

    public void v() {
        s1 s1Var = (s1) this.f15363b;
        t.p pVar = null;
        if (s1Var != null) {
            s1Var.e(null);
        }
        this.f15364c = new t.k(t.d.j, Float.valueOf(0.0f), pVar, 60);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w(float f10, s3.c cVar, qj.z zVar) {
        if (f10 <= cVar.w0(f0.q0.f6186a)) {
            return;
        }
        t1.g gVarF = t1.r.f();
        ti.c cVar2 = null;
        Object[] objArr = 0;
        ej.c cVarE = gVarF != null ? gVarF.e() : null;
        t1.g gVarK = t1.r.k(gVarF);
        try {
            float fFloatValue = ((Number) ((t.k) this.f15364c).f15211b.getValue()).floatValue();
            s1 s1Var = (s1) this.f15363b;
            if (s1Var != null) {
                s1Var.e(null);
            }
            t.k kVar = (t.k) this.f15364c;
            if (kVar.f15215f) {
                this.f15364c = t.d.k(kVar, fFloatValue - f10, 0.0f, 30);
            } else {
                this.f15364c = new t.k(t.d.j, Float.valueOf(-f10), objArr == true ? 1 : 0, 60);
            }
            this.f15363b = qj.b0.w(zVar, null, new z2(this, cVar2, 5), 3);
            t1.r.n(gVarF, gVarK, cVarE);
        } catch (Throwable th2) {
            t1.r.n(gVarF, gVarK, cVarE);
            throw th2;
        }
    }

    public jg.d x(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        jg.e eVarA;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z2 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(y.b(jSONArray3.getString(i10)));
            }
            jg.d dVar = new jg.d(cg.i.f(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzafm zzafmVarZzb = zzafm.zzb(string);
                com.google.android.gms.common.internal.e0.i(zzafmVarZzb);
                dVar.f8872a = zzafmVarZzb;
            }
            if (!z2) {
                dVar.A = Boolean.FALSE;
            }
            dVar.f8878z = str;
            if (jSONObject.has("userMetadata") && (eVarA = jg.e.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                dVar.B = eVarA;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i11));
                    String strOptString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(strOptString) ? ig.v.d(jSONObject2) : Objects.equals(strOptString, "totp") ? ig.y.d(jSONObject2) : null);
                }
                dVar.e(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    arrayList3.add(zzaft.zza(new JSONObject(jSONArray.getString(i12))));
                }
                dVar.F = arrayList3;
            }
            return dVar;
        } catch (zzxy e10) {
            e = e10;
            Log.wtf(((qd.a) this.f15364c).f13474a, e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            Log.wtf(((qd.a) this.f15364c).f13474a, e);
            return null;
        } catch (IllegalArgumentException e12) {
            e = e12;
            Log.wtf(((qd.a) this.f15364c).f13474a, e);
            return null;
        } catch (JSONException e13) {
            e = e13;
            Log.wtf(((qd.a) this.f15364c).f13474a, e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqf
    public void zza(zzaqk zzaqkVar) {
        String str = "Failed to load URL: " + ((String) this.f15363b) + "\n" + zzaqkVar.toString();
        int i10 = l0.f13401b;
        rc.k.g(str);
        ((w) this.f15364c).zzc(null);
    }

    public /* synthetic */ j(int i10, boolean z2) {
        this.f15362a = i10;
    }

    public j(IBinder iBinder) throws RemoteException {
        this.f15362a = 20;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f15363b = new Messenger(iBinder);
            this.f15364c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f15364c = new md.g(iBinder);
            this.f15363b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public /* synthetic */ j(Object obj) {
        this.f15362a = 7;
        this.f15364c = obj;
        this.f15363b = new ArrayList();
    }

    public j(ThreadPoolExecutor threadPoolExecutor) {
        this.f15362a = 22;
        this.f15364c = new q.e(0);
        this.f15363b = threadPoolExecutor;
    }

    public j(int i10) {
        this.f15362a = i10;
        switch (i10) {
            case 10:
                p1 p1Var = t.d.j;
                Float fValueOf = Float.valueOf(0.0f);
                this.f15364c = new t.k(p1Var, fValueOf, (t.p) p1Var.f15249a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
            default:
                nd.e eVar = nd.e.f12278d;
                this.f15363b = new SparseIntArray();
                this.f15364c = eVar;
                break;
        }
    }

    public j(WorkDatabase_Impl workDatabase_Impl, int i10) {
        this.f15362a = i10;
        switch (i10) {
            case 5:
                this.f15363b = workDatabase_Impl;
                this.f15364c = new c8.b(workDatabase_Impl, 3);
                break;
            default:
                this.f15363b = workDatabase_Impl;
                this.f15364c = new c8.b(workDatabase_Impl, 0);
                break;
        }
    }

    public j(c7.b bVar) {
        this.f15362a = 1;
        this.f15363b = bVar;
        this.f15364c = new mh.g(bVar);
    }

    public j(kg.p pVar) {
        this.f15362a = 23;
        this.f15363b = pVar;
        this.f15364c = new AtomicReference();
        pVar.a(new ac.h(this, 21));
    }

    public j(r3 r3Var) {
        this.f15362a = 11;
        this.f15363b = r3Var;
        this.f15364c = new p1.a(0);
    }

    public j(androidx.lifecycle.t tVar, androidx.lifecycle.a1 a1Var) {
        this.f15362a = 12;
        this.f15363b = tVar;
        fj.l.f(a1Var, "store");
        d6.a aVar = d6.a.f4976b;
        fj.l.f(aVar, "defaultCreationExtras");
        s sVar = new s(a1Var, g6.d.f7220d, aVar);
        fj.f fVarA = fj.w.a(g6.d.class);
        String strB = fVarA.b();
        if (strB != null) {
            this.f15364c = (g6.d) sVar.j(fVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public j(EditText editText) {
        this.f15362a = 19;
        this.f15363b = editText;
        this.f15364c = new yh.c(editText);
    }

    public j(cg.i iVar) {
        this.f15362a = 24;
        new HashSet();
        this.f15364c = iVar;
        if (iVar != null) {
            iVar.b();
            this.f15363b = iVar.f3367a;
        } else {
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
        }
    }

    public j(View view) {
        this.f15362a = 0;
        this.f15363b = view;
        this.f15364c = v.P(pi.f.f12998b, new q0.k(this, 9));
    }

    public j(pg.v vVar, ah.e eVar) {
        this.f15362a = 26;
        this.f15364c = vVar;
        this.f15363b = eVar;
        eVar.f469c = this;
    }

    public j(q5.c cVar) {
        this.f15362a = 28;
        this.f15364c = cVar;
    }
}
