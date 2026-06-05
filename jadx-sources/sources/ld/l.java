package ld;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.y;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends zbb {

    /* renamed from: a, reason: collision with root package name */
    public final RevocationBoundService f10925a;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f10925a = revocationBoundService;
    }

    public final void n() throws PackageManager.NameNotFoundException {
        AppOpsManager appOpsManager;
        int callingUid = Binder.getCallingUid();
        RevocationBoundService revocationBoundService = this.f10925a;
        k3.a aVarA = wd.b.a(revocationBoundService);
        aVarA.getClass();
        try {
            appOpsManager = (AppOpsManager) aVarA.f9352a.getSystemService("appops");
        } catch (SecurityException unused) {
        }
        if (appOpsManager == null) {
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        }
        appOpsManager.checkPackage(callingUid, "com.google.android.gms");
        try {
            PackageInfo packageInfo = revocationBoundService.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            nd.j jVarA = nd.j.a(revocationBoundService);
            jVarA.getClass();
            if (packageInfo != null) {
                if (nd.j.d(packageInfo, false)) {
                    return;
                }
                if (nd.j.d(packageInfo, true)) {
                    Context context = jVarA.f12289a;
                    try {
                        if (!nd.i.f12285c) {
                            try {
                                PackageInfo packageInfoD = wd.b.a(context).d(64, "com.google.android.gms");
                                nd.j.a(context);
                                if (packageInfoD == null || nd.j.d(packageInfoD, false) || !nd.j.d(packageInfoD, true)) {
                                    nd.i.f12284b = false;
                                } else {
                                    nd.i.f12284b = true;
                                }
                                nd.i.f12285c = true;
                            } catch (PackageManager.NameNotFoundException e10) {
                                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                                nd.i.f12285c = true;
                            }
                        }
                        if (nd.i.f12284b || !"user".equals(Build.TYPE)) {
                            return;
                        } else {
                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        }
                    } catch (Throwable th2) {
                        nd.i.f12285c = true;
                        throw th2;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
        }
        throw new SecurityException(m6.a.e(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) throws PackageManager.NameNotFoundException {
        BasePendingResult basePendingResultDoWrite;
        BasePendingResult basePendingResultDoWrite2;
        String strD;
        RevocationBoundService revocationBoundService = this.f10925a;
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            n();
            i.W(revocationBoundService).X();
            return true;
        }
        n();
        b bVarA = b.a(revocationBoundService);
        GoogleSignInAccount googleSignInAccountB = bVarA.b();
        GoogleSignInOptions googleSignInOptionsB = GoogleSignInOptions.D;
        if (googleSignInAccountB != null) {
            String strD2 = bVarA.d("defaultGoogleSignInAccount");
            if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
                googleSignInOptionsB = null;
            } else {
                try {
                    googleSignInOptionsB = GoogleSignInOptions.b(strD);
                } catch (JSONException unused) {
                }
            }
        }
        GoogleSignInOptions googleSignInOptions = googleSignInOptionsB;
        e0.i(googleSignInOptions);
        kd.a aVar = new kd.a(this.f10925a, null, fd.a.f6725a, googleSignInOptions, new com.google.android.gms.common.api.l(new h9.a(4), Looper.getMainLooper()));
        if (googleSignInAccountB != null) {
            p pVarAsGoogleApiClient = aVar.asGoogleApiClient();
            Context applicationContext = aVar.getApplicationContext();
            boolean z2 = aVar.c() == 3;
            h.f10921a.a("Revoking access", new Object[0]);
            String strD3 = b.a(applicationContext).d("refreshToken");
            h.a(applicationContext);
            if (!z2) {
                basePendingResultDoWrite2 = ((j0) pVarAsGoogleApiClient).f3557b.doWrite((m) new g(pVarAsGoogleApiClient, 1));
            } else if (strD3 == null) {
                qd.a aVar2 = c.f10905c;
                Status status = new Status(4, null, null, null);
                e0.a("Status code must not be SUCCESS", !status.b());
                basePendingResultDoWrite2 = new y(status);
                basePendingResultDoWrite2.setResult((BasePendingResult) status);
            } else {
                c cVar = new c(strD3);
                new Thread(cVar).start();
                basePendingResultDoWrite2 = cVar.f10907b;
            }
            lh.e eVar = new lh.e();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            basePendingResultDoWrite2.addStatusListener(new com.google.android.gms.common.internal.y(basePendingResultDoWrite2, taskCompletionSource, eVar));
            taskCompletionSource.getTask();
        } else {
            p pVarAsGoogleApiClient2 = aVar.asGoogleApiClient();
            Context applicationContext2 = aVar.getApplicationContext();
            boolean z10 = aVar.c() == 3;
            h.f10921a.a("Signing out", new Object[0]);
            h.a(applicationContext2);
            if (z10) {
                basePendingResultDoWrite = new w(pVarAsGoogleApiClient2);
                basePendingResultDoWrite.setResult((BasePendingResult) Status.f3488e);
            } else {
                basePendingResultDoWrite = ((j0) pVarAsGoogleApiClient2).f3557b.doWrite((m) new g(pVarAsGoogleApiClient2, 0));
            }
            lh.e eVar2 = new lh.e();
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            basePendingResultDoWrite.addStatusListener(new com.google.android.gms.common.internal.y(basePendingResultDoWrite, taskCompletionSource2, eVar2));
            taskCompletionSource2.getTask();
        }
        return true;
    }
}
