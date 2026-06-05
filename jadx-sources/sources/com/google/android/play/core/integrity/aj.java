package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import kf.a0;
import kf.b0;
import kf.c0;
import kf.h0;
import kf.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    final kf.e f4022a;

    /* renamed from: b, reason: collision with root package name */
    private final h0 f4023b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4024c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f4025d;

    /* renamed from: e, reason: collision with root package name */
    private final at f4026e;

    /* renamed from: f, reason: collision with root package name */
    private final k f4027f;

    public aj(Context context, h0 h0Var, at atVar, k kVar) {
        h0 h0Var2;
        this.f4024c = context.getPackageName();
        this.f4023b = h0Var;
        this.f4026e = atVar;
        this.f4027f = kVar;
        this.f4025d = context;
        h0 h0Var3 = kf.g.f9573a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (kf.g.b(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.f4022a = new kf.e(context, h0Var, "IntegrityService", ak.f4028a, new l0() { // from class: com.google.android.play.core.integrity.ae
                            @Override // kf.l0
                            public final Object a(IBinder iBinder) {
                                int i10 = b0.f9555z;
                                if (iBinder == null) {
                                    return null;
                                }
                                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                                return iInterfaceQueryLocalInterface instanceof c0 ? (c0) iInterfaceQueryLocalInterface : new a0(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                            }
                        });
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    h0Var2 = h0Var;
                    h0Var3.c("Play Store package is not found.", new Object[0]);
                }
            } else {
                h0Var3.c("Play Store package is disabled.", new Object[0]);
            }
            h0Var2 = h0Var;
        } catch (PackageManager.NameNotFoundException unused2) {
            h0Var2 = h0Var;
            h0Var3.c("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        h0Var2.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", h0.d(h0Var2.f9575a, "Phonesky is not installed.", objArr));
        }
        this.f4022a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f4024c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        if (parcelable != null) {
            bundle.putParcelable("network", parcelable);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kf.u(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(wd.a.k(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f4022a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i10 = bundle.getInt("dialog.intent.type");
        this.f4023b.b("requestAndShowDialog(%s, %s)", this.f4024c, Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f4022a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f4022a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        if (kf.g.a(this.f4025d) < 82380000) {
            return Tasks.forException(new IntegrityServiceException(-14, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f4023b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f4022a.c(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
