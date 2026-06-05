package com.google.firebase.auth;

import a8.e;
import ak.v;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import cg.i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.p002firebaseauthapi.zzaak;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import ig.c;
import ig.c0;
import ig.d0;
import ig.f;
import ig.g;
import ig.h0;
import ig.l;
import ig.r;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import jg.a;
import jg.d;
import jg.k;
import jg.o;
import jg.p;
import jg.q;
import jg.s;
import oh.b;
import t.m1;
import t0.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class FirebaseAuth implements a {

    /* renamed from: a, reason: collision with root package name */
    public final i f4252a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f4253b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f4254c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f4255d;

    /* renamed from: e, reason: collision with root package name */
    public final zzaak f4256e;

    /* renamed from: f, reason: collision with root package name */
    public l f4257f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4258g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4259h;

    /* renamed from: i, reason: collision with root package name */
    public final String f4260i;
    public v j;

    /* renamed from: k, reason: collision with root package name */
    public final RecaptchaAction f4261k;

    /* renamed from: l, reason: collision with root package name */
    public final RecaptchaAction f4262l;

    /* renamed from: m, reason: collision with root package name */
    public final RecaptchaAction f4263m;

    /* renamed from: n, reason: collision with root package name */
    public final j f4264n;

    /* renamed from: o, reason: collision with root package name */
    public final q f4265o;

    /* renamed from: p, reason: collision with root package name */
    public final b f4266p;

    /* renamed from: q, reason: collision with root package name */
    public final b f4267q;

    /* renamed from: r, reason: collision with root package name */
    public o f4268r;

    /* renamed from: s, reason: collision with root package name */
    public final Executor f4269s;

    /* renamed from: t, reason: collision with root package name */
    public final Executor f4270t;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f4271u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x00a8  */
    /* JADX WARN: Type inference failed for: r5v21, types: [ig.g, jg.p] */
    /* JADX WARN: Type inference failed for: r6v23, types: [ig.g, jg.p] */
    /* JADX WARN: Type inference failed for: r6v24, types: [ig.g, jg.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FirebaseAuth(cg.i r11, oh.b r12, oh.b r13, java.util.concurrent.Executor r14, java.util.concurrent.Executor r15, java.util.concurrent.ScheduledExecutorService r16, java.util.concurrent.Executor r17) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(cg.i, oh.b, oh.b, java.util.concurrent.Executor, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.Executor):void");
    }

    public static void d(FirebaseAuth firebaseAuth, l lVar) {
        if (lVar != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + ((d) lVar).f8873b.f8920a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f4271u.execute(new h0(firebaseAuth));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(com.google.firebase.auth.FirebaseAuth r18, ig.l r19, com.google.android.gms.internal.p002firebaseauthapi.zzafm r20, boolean r21, boolean r22) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.e(com.google.firebase.auth.FirebaseAuth, ig.l, com.google.android.gms.internal.firebase-auth-api.zzafm, boolean, boolean):void");
    }

    public static void f(FirebaseAuth firebaseAuth, l lVar) {
        if (lVar != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + ((d) lVar).f8873b.f8920a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        String strZzc = lVar != null ? ((d) lVar).f8872a.zzc() : null;
        th.b bVar = new th.b();
        bVar.f16331a = strZzc;
        firebaseAuth.f4271u.execute(new e(5, firebaseAuth, bVar, false));
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) i.e().c(FirebaseAuth.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [ig.g, jg.p] */
    public final Task a(boolean z2) {
        l lVar = this.f4257f;
        if (lVar == null) {
            return Tasks.forException(zzach.zza(new Status(17495, null, null, null)));
        }
        zzafm zzafmVar = ((d) lVar).f8872a;
        if (zzafmVar.zzg() && !z2) {
            return Tasks.forResult(k.a(zzafmVar.zzc()));
        }
        return this.f4256e.zza(this.f4252a, lVar, zzafmVar.zzd(), (p) new g(this, 1));
    }

    public final Task b(c cVar) {
        ig.b bVar;
        c cVarC = cVar.c();
        boolean z2 = cVarC instanceof ig.d;
        String str = this.f4260i;
        if (!z2) {
            boolean z10 = cVarC instanceof r;
            i iVar = this.f4252a;
            zzaak zzaakVar = this.f4256e;
            return z10 ? zzaakVar.zza(iVar, (r) cVarC, str, (s) new f(this)) : zzaakVar.zza(iVar, cVarC, str, new f(this));
        }
        ig.d dVar = (ig.d) cVarC;
        String str2 = dVar.f8531c;
        if (TextUtils.isEmpty(str2)) {
            String str3 = dVar.f8529a;
            String str4 = dVar.f8530b;
            e0.i(str4);
            String str5 = this.f4260i;
            return new c0(this, str3, false, null, str4, str5).o0(this, str5, this.f4262l);
        }
        e0.e(str2);
        int i10 = ig.b.f8516c;
        e0.e(str2);
        try {
            bVar = new ig.b(str2);
        } catch (IllegalArgumentException unused) {
            bVar = null;
        }
        return (bVar == null || TextUtils.equals(str, bVar.f8518b)) ? new d0(this, false, null, dVar).o0(this, str, this.f4261k) : Tasks.forException(zzach.zza(new Status(17072, null, null, null)));
    }

    public final void c() {
        j jVar = this.f4264n;
        e0.i(jVar);
        SharedPreferences sharedPreferences = (SharedPreferences) jVar.f15363b;
        l lVar = this.f4257f;
        if (lVar != null) {
            sharedPreferences.edit().remove(m1.i("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((d) lVar).f8873b.f8920a)).apply();
            this.f4257f = null;
        }
        sharedPreferences.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        f(this, null);
        d(this, null);
        o oVar = this.f4268r;
        if (oVar != null) {
            jg.g gVar = oVar.f8899b;
            gVar.f8890d.removeCallbacks(gVar.f8891e);
        }
    }

    @Keep
    public static FirebaseAuth getInstance(i iVar) {
        return (FirebaseAuth) iVar.c(FirebaseAuth.class);
    }
}
