package nb;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import ig.h0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import t.m1;
import tj.d0;
import tj.i0;
import tj.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o {
    public static q A;

    /* renamed from: a, reason: collision with root package name */
    public static final o f12026a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final FirebaseAuth f12027b;

    /* renamed from: c, reason: collision with root package name */
    public static final zh.b f12028c;

    /* renamed from: d, reason: collision with root package name */
    public static final mg.f f12029d;

    /* renamed from: e, reason: collision with root package name */
    public static final jh.c f12030e;

    /* renamed from: f, reason: collision with root package name */
    public static final r0 f12031f;

    /* renamed from: g, reason: collision with root package name */
    public static final d0 f12032g;

    /* renamed from: h, reason: collision with root package name */
    public static final r0 f12033h;

    /* renamed from: i, reason: collision with root package name */
    public static final d0 f12034i;
    public static final r0 j;

    /* renamed from: k, reason: collision with root package name */
    public static final d0 f12035k;

    /* renamed from: l, reason: collision with root package name */
    public static final r0 f12036l;

    /* renamed from: m, reason: collision with root package name */
    public static final d0 f12037m;

    /* renamed from: n, reason: collision with root package name */
    public static final r0 f12038n;

    /* renamed from: o, reason: collision with root package name */
    public static final d0 f12039o;

    /* renamed from: p, reason: collision with root package name */
    public static final r0 f12040p;

    /* renamed from: q, reason: collision with root package name */
    public static final d0 f12041q;

    /* renamed from: r, reason: collision with root package name */
    public static final r0 f12042r;

    /* renamed from: s, reason: collision with root package name */
    public static final d0 f12043s;

    /* renamed from: t, reason: collision with root package name */
    public static final r0 f12044t;

    /* renamed from: u, reason: collision with root package name */
    public static final d0 f12045u;

    /* renamed from: v, reason: collision with root package name */
    public static final r0 f12046v;

    /* renamed from: w, reason: collision with root package name */
    public static final d0 f12047w;

    /* renamed from: x, reason: collision with root package name */
    public static final r0 f12048x;

    /* renamed from: y, reason: collision with root package name */
    public static final d0 f12049y;

    /* renamed from: z, reason: collision with root package name */
    public static w8.a f12050z;

    static {
        jh.c cVarA;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        fj.l.e(firebaseAuth, "getInstance(...)");
        f12027b = firebaseAuth;
        zh.b bVarC = ((zh.i) cg.i.e().c(zh.i.class)).c();
        fj.l.e(bVarC, "getInstance(...)");
        f12028c = bVarC;
        f12029d = mg.f.b();
        TaskCompletionSource taskCompletionSource = jh.c.f8933h;
        jh.f fVar = (jh.f) cg.i.e().c(jh.f.class);
        e0.j(fVar, "Functions component does not exist.");
        synchronized (fVar) {
            cVarA = (jh.c) fVar.f8951a.get("europe-west1");
            if (cVarA == null) {
                cVarA = fVar.f8952b.a();
                fVar.f8951a.put("europe-west1", cVarA);
            }
        }
        f12030e = cVarA;
        r0 r0VarB = i0.b(firebaseAuth.f4257f);
        f12031f = r0VarB;
        f12032g = new d0(r0VarB);
        Boolean bool = Boolean.FALSE;
        r0 r0VarB2 = i0.b(bool);
        f12033h = r0VarB2;
        f12034i = new d0(r0VarB2);
        r0 r0VarB3 = i0.b(bool);
        j = r0VarB3;
        f12035k = new d0(r0VarB3);
        r0 r0VarB4 = i0.b(bool);
        f12036l = r0VarB4;
        f12037m = new d0(r0VarB4);
        r0 r0VarB5 = i0.b(bool);
        f12038n = r0VarB5;
        f12039o = new d0(r0VarB5);
        r0 r0VarB6 = i0.b("Critical shutdown. Please check for updates.");
        f12040p = r0VarB6;
        f12041q = new d0(r0VarB6);
        r0 r0VarB7 = i0.b(x.f12086a);
        f12042r = r0VarB7;
        f12043s = new d0(r0VarB7);
        r0 r0VarB8 = i0.b(null);
        f12044t = r0VarB8;
        f12045u = new d0(r0VarB8);
        r0 r0VarB9 = i0.b(bool);
        f12046v = r0VarB9;
        f12047w = new d0(r0VarB9);
        r0 r0VarB10 = i0.b(null);
        f12048x = r0VarB10;
        f12049y = new d0(r0VarB10);
        A = q.f12053a;
        Map mapI0 = qi.v.i0(new pi.h("beta_mode", bool), new pi.h("dev_beta_mode", bool), new pi.h("min_version", 0L), new pi.h("shutdown", bool), new pi.h("apk_ban", Boolean.TRUE), new pi.h("monthlyLabel", "4 EUR / month \u00b7 billed monthly"), new pi.h("yearlyLabel", "Best value \u00b7 billed yearly"));
        HashMap map = new HashMap();
        for (Map.Entry entry : mapI0.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map.put((String) entry.getKey(), new String((byte[]) value));
            } else {
                map.put((String) entry.getKey(), value.toString());
            }
        }
        int i10 = 8;
        try {
            ai.f fVarC = ai.g.c();
            fVarC.f509a = new JSONObject(map);
            bVarC.f20627e.d(fVarC.a()).onSuccessTask(lg.i.f10960a, new vf.j(i10));
        } catch (JSONException e10) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e10);
            Tasks.forResult(null);
        }
        zh.b bVar = f12028c;
        ug.f fVar2 = new ug.f();
        int[] iArr = ai.j.j;
        fVar2.f17074a = 3600L;
        ug.f fVar3 = new ug.f();
        fVar3.f17074a = fVar2.f17074a;
        Tasks.call(bVar.f20624b, new ai.d(3, bVar, fVar3));
        Task taskB = bVar.f20625c.b();
        Task taskB2 = bVar.f20626d.b();
        Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(bVar.f20624b, new ai.n(bVar, taskB, taskB2, i10)).addOnCompleteListener(new l7.n(10));
        FirebaseAuth firebaseAuth2 = f12027b;
        h hVar = new h();
        firebaseAuth2.f4255d.add(hVar);
        firebaseAuth2.f4271u.execute(new h0(firebaseAuth2, hVar));
    }

    public static String b(z4.c cVar) throws a5.a {
        if (!(cVar instanceof z4.i) || !cVar.f20373a.equals("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
            throw new IllegalStateException("Unexpected credential type: ".concat(cVar.f20373a).toString());
        }
        Bundle bundle = cVar.f20374b;
        try {
            String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            fj.l.c(string);
            fj.l.c(string2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", string);
            bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", string2);
            bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", string3);
            bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", string4);
            bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", string5);
            bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", string6);
            bundle2.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
            if (string.length() <= 0) {
                throw new IllegalArgumentException("id should not be empty");
            }
            if (string2.length() > 0) {
                return string2;
            }
            throw new IllegalArgumentException("idToken should not be empty");
        } catch (Exception e10) {
            throw new a5.a(e10);
        }
    }

    public static void d(Activity activity, q qVar) {
        w8.a qVar2;
        fj.l.f(activity, "activity");
        fj.l.f(qVar, "plan");
        if (f12027b.f4257f == null) {
            r0 r0Var = f12042r;
            w wVar = new w("Sign in first to purchase.");
            r0Var.getClass();
            r0Var.k(null, wVar);
            return;
        }
        A = qVar;
        r0 r0Var2 = f12042r;
        y yVar = y.f12088a;
        r0Var2.getClass();
        r0Var2.k(null, yVar);
        ac.h hVar = new ac.h(activity, 19);
        r5.f fVar = new r5.f(activity);
        fVar.f13729c = hVar;
        fVar.f13727a = new y9.a();
        if (((ac.h) fVar.f13729c) == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (((y9.a) fVar.f13727a) == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        ((y9.a) fVar.f13727a).getClass();
        if (((ac.h) fVar.f13729c) != null) {
            y9.a aVar = (y9.a) fVar.f13727a;
            ac.h hVar2 = (ac.h) fVar.f13729c;
            qVar2 = fVar.a() ? new w8.q(aVar, activity, hVar2) : new w8.a(aVar, activity, hVar2);
        } else {
            y9.a aVar2 = (y9.a) fVar.f13727a;
            qVar2 = fVar.a() ? new w8.q(aVar2, activity) : new w8.a(aVar2, activity);
        }
        f12050z = qVar2;
        try {
            qVar2.f(new p7.k(activity, 16));
        } catch (SecurityException e10) {
            r0 r0Var3 = f12042r;
            w wVar2 = new w("Google Play Services error: Not installed or unavailable.");
            r0Var3.getClass();
            r0Var3.k(null, wVar2);
            e10.printStackTrace();
        } catch (Exception e11) {
            r0 r0Var4 = f12042r;
            w wVar3 = new w(m1.i("Failed to initialize billing: ", e11.getMessage()));
            r0Var4.getClass();
            r0Var4.k(null, wVar3);
            e11.printStackTrace();
        }
    }

    public static void e() {
        zh.b bVar = f12028c;
        String strC = bVar.c("monthlyLabel");
        if (nj.e.K0(strC)) {
            strC = "4 EUR / month \u00b7 billed monthly";
        }
        String strC2 = bVar.c("yearlyLabel");
        if (nj.e.K0(strC2)) {
            strC2 = "Best value \u00b7 billed yearly";
        }
        p pVar = new p(strC, strC2);
        r0 r0Var = f12044t;
        r0Var.getClass();
        r0Var.k(null, pVar);
    }

    public static void g() {
        boolean zB = f12028c.b("beta_mode");
        r0 r0Var = f12033h;
        if (zB) {
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.k(null, bool);
            return;
        }
        ig.l lVar = f12027b.f4257f;
        if (lVar == null) {
            Boolean bool2 = Boolean.FALSE;
            r0Var.getClass();
            r0Var.k(null, bool2);
        } else {
            f12029d.e("users/" + ((jg.d) lVar).f8873b.f8920a + "/isPro").c().addOnSuccessListener(new ac.h(new la.a(19), 20)).addOnFailureListener(new l7.n(6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(jg.d r13, vi.c r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.o.a(jg.d, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r11, vi.c r12) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.o.c(android.content.Context, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(vi.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof nb.k
            if (r0 == 0) goto L13
            r0 = r7
            nb.k r0 = (nb.k) r0
            int r1 = r0.f12011c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12011c = r1
            goto L18
        L13:
            nb.k r0 = new nb.k
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f12009a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f12011c
            tj.r0 r3 = nb.o.f12046v
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            uk.c.R(r7)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            r7 = move-exception
            goto L56
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            uk.c.R(r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r3.getClass()
            r3.k(r5, r7)
            zh.b r7 = nb.o.f12028c     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.tasks.Task r7 = r7.a()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "fetchAndActivate(...)"
            fj.l.e(r7, r2)     // Catch: java.lang.Throwable -> L2a
            r0.f12011c = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = u1.b.c(r7, r0)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r1) goto L53
            return r1
        L53:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2a
            goto L5a
        L56:
            pi.j r7 = uk.c.r(r7)
        L5a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r7 instanceof pi.j
            if (r1 == 0) goto L61
            r7 = r0
        L61:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            pi.o r0 = pi.o.f13011a
            if (r7 != 0) goto L6c
            return r0
        L6c:
            e()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r3.getClass()
            r3.k(r5, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.o.f(vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.content.Context r10, java.lang.String r11, vi.c r12) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r12 instanceof nb.l
            if (r0 == 0) goto L13
            r0 = r12
            nb.l r0 = (nb.l) r0
            int r1 = r0.f12016e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12016e = r1
            goto L18
        L13:
            nb.l r0 = new nb.l
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f12014c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f12016e
            com.google.firebase.auth.FirebaseAuth r3 = nb.o.f12027b
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L44
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            ig.l r10 = r0.f12013b
            uk.c.R(r12)     // Catch: java.lang.Exception -> L32
            return r10
        L32:
            r10 = move-exception
            goto L92
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            ig.l r10 = r0.f12013b
            android.content.Context r11 = r0.f12012a
            uk.c.R(r12)     // Catch: java.lang.Exception -> L32
            goto L7c
        L44:
            android.content.Context r10 = r0.f12012a
            uk.c.R(r12)     // Catch: java.lang.Exception -> L32
            goto L66
        L4a:
            uk.c.R(r12)
            ig.o r12 = new ig.o     // Catch: java.lang.Exception -> L32
            r12.<init>(r11, r7)     // Catch: java.lang.Exception -> L32
            com.google.android.gms.tasks.Task r11 = r3.b(r12)     // Catch: java.lang.Exception -> L32
            java.lang.String r12 = "signInWithCredential(...)"
            fj.l.e(r11, r12)     // Catch: java.lang.Exception -> L32
            r0.f12012a = r10     // Catch: java.lang.Exception -> L32
            r0.f12016e = r6     // Catch: java.lang.Exception -> L32
            java.lang.Object r12 = u1.b.c(r11, r0)     // Catch: java.lang.Exception -> L32
            if (r12 != r1) goto L66
            goto L88
        L66:
            jg.x r12 = (jg.x) r12     // Catch: java.lang.Exception -> L32
            jg.d r11 = r12.f8917a     // Catch: java.lang.Exception -> L32
            if (r11 == 0) goto L8a
            r0.f12012a = r10     // Catch: java.lang.Exception -> L32
            r0.f12013b = r11     // Catch: java.lang.Exception -> L32
            r0.f12016e = r5     // Catch: java.lang.Exception -> L32
            java.lang.Object r12 = r9.a(r11, r0)     // Catch: java.lang.Exception -> L32
            if (r12 != r1) goto L79
            goto L88
        L79:
            r8 = r11
            r11 = r10
            r10 = r8
        L7c:
            r0.f12012a = r7     // Catch: java.lang.Exception -> L32
            r0.f12013b = r10     // Catch: java.lang.Exception -> L32
            r0.f12016e = r4     // Catch: java.lang.Exception -> L32
            java.lang.Object r11 = r9.c(r11, r0)     // Catch: java.lang.Exception -> L32
            if (r11 != r1) goto L89
        L88:
            return r1
        L89:
            return r10
        L8a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L32
            java.lang.String r11 = "Firebase sign-in returned null user"
            r10.<init>(r11)     // Catch: java.lang.Exception -> L32
            throw r10     // Catch: java.lang.Exception -> L32
        L92:
            r3.c()
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            tj.r0 r12 = nb.o.f12033h
            r12.getClass()
            r12.k(r7, r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.o.h(android.content.Context, java.lang.String, vi.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(android.content.Context r8, vi.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof nb.m
            if (r0 == 0) goto L13
            r0 = r9
            nb.m r0 = (nb.m) r0
            int r1 = r0.f12022f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12022f = r1
            goto L18
        L13:
            nb.m r0 = new nb.m
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f12020d
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f12022f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            uk.c.R(r9)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            goto L7d
        L2b:
            r8 = move-exception
            goto L90
        L2d:
            r8 = move-exception
            goto L80
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            int r8 = r0.f12019c
            nb.o r2 = r0.f12018b
            android.content.Context r4 = r0.f12017a
            uk.c.R(r9)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
            goto L65
        L45:
            uk.c.R(r9)
            java.lang.String r9 = "context"
            fj.l.f(r8, r9)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            p9.a r9 = new p9.a     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r2 = 17
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r0.f12017a = r8     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r0.f12018b = r7     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r2 = 0
            r0.f12019c = r2     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r0.f12022f = r4     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.Object r9 = r7.j(r8, r9, r0)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            if (r9 != r1) goto L64
            goto L7c
        L64:
            r4 = r7
        L65:
            z4.c r9 = (z4.c) r9     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r4.getClass()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.String r9 = b(r9)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r0.f12017a = r5     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r0.f12018b = r5     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r0.f12019c = r2     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r0.f12022f = r3     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.Object r9 = r4.h(r8, r9, r0)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            if (r9 != r1) goto L7d
        L7c:
            return r1
        L7d:
            ig.l r9 = (ig.l) r9     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            return r9
        L80:
            com.google.firebase.auth.FirebaseAuth r9 = nb.o.f12027b     // Catch: java.lang.Throwable -> L2b
            r9.c()     // Catch: java.lang.Throwable -> L2b
            tj.r0 r9 = nb.o.f12033h     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2b
            r9.getClass()     // Catch: java.lang.Throwable -> L2b
            r9.k(r5, r0)     // Catch: java.lang.Throwable -> L2b
            throw r8     // Catch: java.lang.Throwable -> L2b
        L90:
            pi.j r8 = uk.c.r(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.o.i(android.content.Context, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(android.content.Context r6, p9.a r7, vi.c r8) throws a5.d, android.content.pm.PackageManager.NameNotFoundException {
        /*
            r5 = this;
            boolean r0 = r8 instanceof nb.n
            if (r0 == 0) goto L13
            r0 = r8
            nb.n r0 = (nb.n) r0
            int r1 = r0.f12025c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12025c = r1
            goto L18
        L13:
            nb.n r0 = new nb.n
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f12023a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f12025c
            java.lang.String r3 = "ProManager"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            uk.c.R(r8)     // Catch: a5.d -> L29 a5.f -> L2b
            goto L62
        L29:
            r6 = move-exception
            goto L67
        L2b:
            r6 = move-exception
            goto L7b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            uk.c.R(r8)
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.String r8 = r8.toString()
            le.a r2 = new le.a
            r2.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r8.add(r2)
            z4.j r2 = new z4.j
            java.util.List r8 = qi.l.R0(r8)
            r2.<init>(r8)
            r0.f12025c = r4     // Catch: a5.d -> L29 a5.f -> L2b
            r7.getClass()     // Catch: a5.d -> L29 a5.f -> L2b
            java.lang.Object r8 = p9.a.g(r6, r2, r0)     // Catch: a5.d -> L29 a5.f -> L2b
            if (r8 != r1) goto L62
            return r1
        L62:
            z4.k r8 = (z4.k) r8     // Catch: a5.d -> L29 a5.f -> L2b
            z4.c r6 = r8.f20378a     // Catch: a5.d -> L29 a5.f -> L2b
            return r6
        L67:
            java.lang.String r7 = r6.a()
            java.lang.String r8 = r6.getMessage()
            java.lang.String r0 = "Direct Google sign-in failed: "
            java.lang.String r1 = ": "
            java.lang.String r7 = y8.f.b(r0, r7, r1, r8)
            android.util.Log.e(r3, r7, r6)
            throw r6
        L7b:
            java.lang.String r7 = "Google sign-in returned no credential after account selection."
            android.util.Log.e(r3, r7, r6)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Google sign-in failed after account selection. Update Google Play Services and try again."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.o.j(android.content.Context, p9.a, vi.c):java.lang.Object");
    }
}
