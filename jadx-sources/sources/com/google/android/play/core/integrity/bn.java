package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.ArrayList;
import kf.h0;
import kf.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class bn {

    /* renamed from: a, reason: collision with root package name */
    final kf.e f4084a;

    /* renamed from: b, reason: collision with root package name */
    private final h0 f4085b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4086c;

    /* renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f4087d;

    /* renamed from: e, reason: collision with root package name */
    private final at f4088e;

    /* renamed from: f, reason: collision with root package name */
    private final k f4089f;

    public bn(Context context, h0 h0Var, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f4087d = taskCompletionSource;
        this.f4086c = context.getPackageName();
        this.f4085b = h0Var;
        this.f4088e = atVar;
        this.f4089f = kVar;
        kf.e eVar = new kf.e(context, h0Var, "ExpressIntegrityService", bo.f4090a, new l0() { // from class: com.google.android.play.core.integrity.bd
            @Override // kf.l0
            public final Object a(IBinder iBinder) {
                int i10 = kf.w.f9600z;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                return iInterfaceQueryLocalInterface instanceof kf.x ? (kf.x) iInterfaceQueryLocalInterface : new kf.v(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            }
        });
        this.f4084a = eVar;
        eVar.a().post(new be(this, taskCompletionSource, context));
    }

    public static Bundle a(bn bnVar, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j4, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f4086c);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", standardIntegrityTokenRequest.requestHash());
        bundle.putLong("warm.up.sid", j4);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(standardIntegrityTokenRequest.verdictOptOut()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kf.u(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(wd.a.k(arrayList)));
        return bundle;
    }

    public static Bundle b(bn bnVar, long j, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f4086c);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kf.u(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(wd.a.k(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar, int i10) {
        return bnVar.f4087d.getTask().isSuccessful() && ((Integer) bnVar.f4087d.getTask().getResult()).intValue() < 83420000;
    }

    public static /* bridge */ /* synthetic */ boolean l(bn bnVar) {
        return bnVar.f4087d.getTask().isSuccessful() && ((Integer) bnVar.f4087d.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i10 = bundle.getInt("dialog.intent.type");
        this.f4085b.b("requestAndShowDialog(%s)", Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f4084a.c(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j4, int i10) {
        this.f4085b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j4));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f4084a.c(new bg(this, taskCompletionSource, 0, standardIntegrityTokenRequest, j, j4, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j, int i10) {
        this.f4085b.b("warmUpIntegrityToken(%s)", Long.valueOf(j));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f4084a.c(new bf(this, taskCompletionSource, 0, j, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
