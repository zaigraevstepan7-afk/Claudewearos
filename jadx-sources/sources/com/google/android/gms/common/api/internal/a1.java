package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zau;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3504a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3506c;

    public /* synthetic */ a1(int i10, Object obj, Object obj2) {
        this.f3504a = i10;
        this.f3506c = obj;
        this.f3505b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.n nVar;
        com.google.android.gms.common.internal.n q0Var = null;
        switch (this.f3504a) {
            case 0:
                if (((c0) this.f3506c).f3515a) {
                    nd.b bVar = ((z0) this.f3505b).f3607b;
                    if (bVar.f12268b != 0 && bVar.f12269c != null) {
                        c0 c0Var = (c0) this.f3506c;
                        l lVar = c0Var.mLifecycleFragment;
                        Activity activity = c0Var.getActivity();
                        PendingIntent pendingIntent = bVar.f12269c;
                        com.google.android.gms.common.internal.e0.i(pendingIntent);
                        int i10 = ((z0) this.f3505b).f3606a;
                        int i11 = GoogleApiActivity.f3484b;
                        Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i10);
                        intent.putExtra("notify_manager", false);
                        lVar.startActivityForResult(intent, 1);
                        return;
                    }
                    c0 c0Var2 = (c0) this.f3506c;
                    if (c0Var2.f3518d.b(c0Var2.getActivity(), null, bVar.f12268b) != null) {
                        c0 c0Var3 = (c0) this.f3506c;
                        c0Var3.f3518d.i(c0Var3.getActivity(), c0Var3.mLifecycleFragment, bVar.f12268b, (c0) this.f3506c);
                        return;
                    }
                    if (bVar.f12268b != 18) {
                        c0 c0Var4 = (c0) this.f3506c;
                        int i12 = ((z0) this.f3505b).f3606a;
                        c0Var4.f3516b.set(null);
                        c0Var4.f3520f.i(bVar, i12);
                        return;
                    }
                    c0 c0Var5 = (c0) this.f3506c;
                    nd.e eVar = c0Var5.f3518d;
                    Activity activity2 = c0Var5.getActivity();
                    eVar.getClass();
                    ProgressBar progressBar = new ProgressBar(activity2, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
                    builder.setView(progressBar);
                    builder.setMessage(com.google.android.gms.common.internal.w.b(activity2, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog alertDialogCreate = builder.create();
                    nd.e.g(activity2, alertDialogCreate, "GooglePlayServicesUpdatingDialog", c0Var5);
                    c0 c0Var6 = (c0) this.f3506c;
                    Context applicationContext = c0Var6.getActivity().getApplicationContext();
                    b0 b0Var = new b0(this, alertDialogCreate);
                    c0Var6.f3518d.getClass();
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    k0 k0Var = new k0(b0Var);
                    zao.zaa(applicationContext, k0Var, intentFilter);
                    k0Var.f3559a = applicationContext;
                    if (nd.i.a(applicationContext)) {
                        return;
                    }
                    c0 c0Var7 = (c0) this.f3506c;
                    c0Var7.f3516b.set(null);
                    zau zauVar = c0Var7.f3520f.G;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    if (alertDialogCreate.isShowing()) {
                        alertDialogCreate.dismiss();
                    }
                    synchronized (k0Var) {
                        try {
                            Context context = k0Var.f3559a;
                            if (context != null) {
                                context.unregisterReceiver(k0Var);
                            }
                            k0Var.f3559a = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            case 1:
                nd.b bVar2 = (nd.b) this.f3505b;
                i0 i0Var = (i0) this.f3506c;
                com.google.android.gms.common.api.g gVar = (com.google.android.gms.common.api.g) i0Var.f3552b;
                g0 g0Var = (g0) ((h) i0Var.f3556f).C.get((a) i0Var.f3553c);
                if (g0Var == null) {
                    return;
                }
                if (bVar2.f12268b != 0) {
                    g0Var.m(bVar2, null);
                    return;
                }
                i0Var.f3551a = true;
                if (gVar.requiresSignIn()) {
                    if (!i0Var.f3551a || (nVar = (com.google.android.gms.common.internal.n) i0Var.f3554d) == null) {
                        return;
                    }
                    gVar.getRemoteService(nVar, (Set) i0Var.f3555e);
                    return;
                }
                try {
                    gVar.getRemoteService(null, gVar.getScopesForConnectionlessNonSignIn());
                    return;
                } catch (SecurityException e10) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                    gVar.disconnect("Failed to get service from broker.");
                    g0Var.m(new nd.b(10), null);
                    return;
                }
            case 2:
                o oVar = (o) this.f3505b;
                n nVar2 = (n) this.f3506c;
                Object obj = oVar.f3569b;
                if (obj == null) {
                    nVar2.onNotifyListenerFailed();
                    return;
                }
                try {
                    nVar2.notifyListener(obj);
                    return;
                } catch (RuntimeException e11) {
                    nVar2.onNotifyListenerFailed();
                    throw e11;
                }
            default:
                q0 q0Var2 = (q0) this.f3506c;
                je.g gVar2 = (je.g) this.f3505b;
                nd.b bVar3 = gVar2.f8867b;
                if (bVar3.f12268b == 0) {
                    com.google.android.gms.common.internal.a0 a0Var = gVar2.f8868c;
                    com.google.android.gms.common.internal.e0.i(a0Var);
                    nd.b bVar4 = a0Var.f3617c;
                    if (bVar4.f12268b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar4)), new Exception());
                        q0Var2.f3584z.b(bVar4);
                        q0Var2.f3583f.disconnect();
                        return;
                    }
                    i0 i0Var2 = q0Var2.f3584z;
                    IBinder iBinder = a0Var.f3616b;
                    if (iBinder != null) {
                        int i13 = com.google.android.gms.common.internal.a.f3614a;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        q0Var = iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.n ? (com.google.android.gms.common.internal.n) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.q0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                    }
                    Set set = q0Var2.f3581d;
                    i0Var2.getClass();
                    if (q0Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        i0Var2.b(new nd.b(4));
                    } else {
                        i0Var2.f3554d = q0Var;
                        i0Var2.f3555e = set;
                        if (i0Var2.f3551a) {
                            ((com.google.android.gms.common.api.g) i0Var2.f3552b).getRemoteService(q0Var, set);
                        }
                    }
                } else {
                    q0Var2.f3584z.b(bVar3);
                }
                q0Var2.f3583f.disconnect();
                return;
        }
    }

    public /* synthetic */ a1(o oVar, n nVar) {
        this.f3504a = 2;
        this.f3505b = oVar;
        this.f3506c = nVar;
    }
}
