package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.common.api.internal.z;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class m {
    protected final com.google.android.gms.common.api.internal.h zaa;
    private final Context zab;
    private final String zac;
    private final i zad;
    private final e zae;
    private final com.google.android.gms.common.api.internal.a zaf;
    private final Looper zag;
    private final int zah;
    private final p zai;
    private final com.google.android.gms.common.api.internal.v zaj;

    public m(Context context, Activity activity, i iVar, e eVar, l lVar) {
        e0.j(context, "Null context is not permitted.");
        e0.j(iVar, "Api must not be null.");
        e0.j(lVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        e0.j(applicationContext, "The provided context did not have an application context.");
        this.zab = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : getApiFallbackAttributionTag(context);
        this.zac = attributionTag;
        this.zad = iVar;
        this.zae = eVar;
        this.zag = lVar.f3610b;
        com.google.android.gms.common.api.internal.a aVar = new com.google.android.gms.common.api.internal.a(iVar, eVar, attributionTag);
        this.zaf = aVar;
        this.zai = new j0(this);
        com.google.android.gms.common.api.internal.h hVarH = com.google.android.gms.common.api.internal.h.h(applicationContext);
        this.zaa = hVarH;
        this.zah = hVarH.A.getAndIncrement();
        this.zaj = lVar.f3609a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.l fragment = LifecycleCallback.getFragment(activity);
            c0 c0Var = (c0) fragment.d(c0.class, "ConnectionlessLifecycleHelper");
            if (c0Var == null) {
                Object obj = nd.e.f12277c;
                c0Var = new c0(fragment, hVarH);
            }
            c0Var.f3519e.add(aVar);
            hVarH.b(c0Var);
        }
        zau zauVar = hVarH.G;
        zauVar.sendMessage(zauVar.obtainMessage(7, this));
    }

    public final void a(int i10, com.google.android.gms.common.api.internal.d dVar) {
        dVar.zak();
        com.google.android.gms.common.api.internal.h hVar = this.zaa;
        hVar.getClass();
        p0 p0Var = new p0(new v0(i10, dVar), hVar.B.get(), this);
        zau zauVar = hVar.G;
        zauVar.sendMessage(zauVar.obtainMessage(4, p0Var));
    }

    public p asGoogleApiClient() {
        return this.zai;
    }

    public final Task b(int i10, com.google.android.gms.common.api.internal.y yVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.v vVar = this.zaj;
        com.google.android.gms.common.api.internal.h hVar = this.zaa;
        hVar.getClass();
        hVar.g(taskCompletionSource, yVar.f3604c, this);
        p0 p0Var = new p0(new w0(i10, yVar, taskCompletionSource, vVar), hVar.B.get(), this);
        zau zauVar = hVar.G;
        zauVar.sendMessage(zauVar.obtainMessage(4, p0Var));
        return taskCompletionSource.getTask();
    }

    public com.google.android.gms.common.internal.h createClientSettingsBuilder() {
        com.google.android.gms.common.internal.h hVar = new com.google.android.gms.common.internal.h();
        Set set = Collections.EMPTY_SET;
        if (hVar.f3635a == null) {
            hVar.f3635a = new q.f(0);
        }
        hVar.f3635a.addAll(set);
        hVar.f3637c = this.zab.getClass().getName();
        hVar.f3636b = this.zab.getPackageName();
        return hVar;
    }

    public Task<Boolean> disconnectService() {
        com.google.android.gms.common.api.internal.h hVar = this.zaa;
        hVar.getClass();
        d0 d0Var = new d0(getApiKey());
        zau zauVar = hVar.G;
        zauVar.sendMessage(zauVar.obtainMessage(14, d0Var));
        return d0Var.f3526b.getTask();
    }

    public <A extends b, T extends com.google.android.gms.common.api.internal.d> T doBestEffortWrite(T t10) {
        a(2, t10);
        return t10;
    }

    public <A extends b, T extends com.google.android.gms.common.api.internal.d> T doRead(T t10) {
        a(0, t10);
        return t10;
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends b, T extends com.google.android.gms.common.api.internal.r, U extends z> Task<Void> doRegisterEventListener(T t10, U u10) {
        e0.i(t10);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(com.google.android.gms.common.api.internal.m mVar) {
        return doUnregisterEventListener(mVar, 0);
    }

    public <A extends b, T extends com.google.android.gms.common.api.internal.d> T doWrite(T t10) {
        a(1, t10);
        return t10;
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final com.google.android.gms.common.api.internal.a getApiKey() {
        return this.zaf;
    }

    public e getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> com.google.android.gms.common.api.internal.o registerListener(L l10, String str) {
        return x8.a.s(this.zag, l10, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g zab(Looper looper, g0 g0Var) {
        com.google.android.gms.common.internal.h hVarCreateClientSettingsBuilder = createClientSettingsBuilder();
        com.google.android.gms.common.internal.i iVar = new com.google.android.gms.common.internal.i(hVarCreateClientSettingsBuilder.f3635a, null, hVarCreateClientSettingsBuilder.f3636b, hVarCreateClientSettingsBuilder.f3637c, ie.a.f8506a);
        a aVar = this.zad.f3495a;
        e0.i(aVar);
        g gVarBuildClient = aVar.buildClient(this.zab, looper, iVar, (Object) this.zae, (n) g0Var, (o) g0Var);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (gVarBuildClient instanceof com.google.android.gms.common.internal.f)) {
            ((com.google.android.gms.common.internal.f) gVarBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(gVarBuildClient instanceof com.google.android.gms.common.api.internal.p)) {
            return gVarBuildClient;
        }
        m6.a.q(gVarBuildClient);
        throw null;
    }

    public final q0 zac(Context context, Handler handler) {
        com.google.android.gms.common.internal.h hVarCreateClientSettingsBuilder = createClientSettingsBuilder();
        return new q0(context, handler, new com.google.android.gms.common.internal.i(hVarCreateClientSettingsBuilder.f3635a, null, hVarCreateClientSettingsBuilder.f3636b, hVarCreateClientSettingsBuilder.f3637c, ie.a.f8506a));
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doBestEffortWrite(com.google.android.gms.common.api.internal.y yVar) {
        return b(2, yVar);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doRead(com.google.android.gms.common.api.internal.y yVar) {
        return b(0, yVar);
    }

    @ResultIgnorabilityUnspecified
    public <A extends b> Task<Void> doRegisterEventListener(com.google.android.gms.common.api.internal.s sVar) {
        e0.i(sVar);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(com.google.android.gms.common.api.internal.m mVar, int i10) {
        e0.j(mVar, "Listener key cannot be null.");
        com.google.android.gms.common.api.internal.h hVar = this.zaa;
        hVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.g(taskCompletionSource, i10, this);
        p0 p0Var = new p0(new x0(mVar, taskCompletionSource), hVar.B.get(), this);
        zau zauVar = hVar.G;
        zauVar.sendMessage(zauVar.obtainMessage(13, p0Var));
        return taskCompletionSource.getTask();
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doWrite(com.google.android.gms.common.api.internal.y yVar) {
        return b(1, yVar);
    }
}
