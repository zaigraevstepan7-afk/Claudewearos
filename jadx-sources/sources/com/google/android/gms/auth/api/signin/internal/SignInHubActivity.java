package com.google.android.gms.auth.api.signin.internal;

import ag.i;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.lifecycle.a1;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;
import d6.a;
import fj.f;
import fj.l;
import g6.b;
import g6.c;
import g6.d;
import java.lang.reflect.Modifier;
import java.util.Set;
import q.q0;
import w5.w;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends w {
    public static boolean W = false;
    public boolean R = false;
    public SignInConfiguration S;
    public boolean T;
    public int U;
    public Intent V;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void o() {
        a1 a1VarE = e();
        c cVar = d.f7220d;
        l.f(a1VarE, "store");
        a aVar = a.f4976b;
        l.f(aVar, "defaultCreationExtras");
        s sVar = new s(a1VarE, cVar, aVar);
        f fVarA = fj.w.a(d.class);
        String strB = fVarA.b();
        if (strB == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        d dVar = (d) sVar.j(fVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        i iVar = new i(this, 11);
        boolean z2 = dVar.f7222c;
        q0 q0Var = dVar.f7221b;
        if (z2) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        g6.a aVar2 = (g6.a) q0Var.c(0);
        if (aVar2 == null) {
            try {
                dVar.f7222c = true;
                Set set = p.f3611a;
                synchronized (set) {
                }
                ld.d dVar2 = new ld.d(this, set);
                if (ld.d.class.isMemberClass() && !Modifier.isStatic(ld.d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dVar2);
                }
                g6.a aVar3 = new g6.a(dVar2);
                q0Var.d(0, aVar3);
                dVar.f7222c = false;
                b bVar = new b(aVar3.f7213l, iVar);
                aVar3.d(this, bVar);
                b bVar2 = aVar3.f7215n;
                if (bVar2 != null) {
                    aVar3.h(bVar2);
                }
                aVar3.f7214m = this;
                aVar3.f7215n = bVar;
            } catch (Throwable th2) {
                dVar.f7222c = false;
                throw th2;
            }
        } else {
            b bVar3 = new b(aVar2.f7213l, iVar);
            aVar2.d(this, bVar3);
            b bVar4 = aVar2.f7215n;
            if (bVar4 != null) {
                aVar2.h(bVar4);
            }
            aVar2.f7214m = this;
            aVar2.f7215n = bVar3;
        }
        W = false;
    }

    @Override // w5.w, c.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.R) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f3480b) != null) {
                ld.i iVarW = ld.i.W(this);
                GoogleSignInOptions googleSignInOptions = this.S.f3483b;
                synchronized (iVarW) {
                    ((ld.b) iVarW.f10924b).c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.T = true;
                this.U = i11;
                this.V = intent;
                o();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                p(intExtra);
                return;
            }
        }
        p(8);
    }

    @Override // w5.w, c.m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            p(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            p(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.S = signInConfiguration;
        if (bundle != null) {
            boolean z2 = bundle.getBoolean("signingInGoogleApiClients");
            this.T = z2;
            if (z2) {
                this.U = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.V = intent2;
                    o();
                    return;
                } else {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (W) {
            setResult(0);
            p(12502);
            return;
        }
        W = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.S);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.R = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            p(17);
        }
    }

    @Override // w5.w, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        W = false;
    }

    @Override // c.m, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.T);
        if (this.T) {
            bundle.putInt("signInResultCode", this.U);
            bundle.putParcelable("signInResultData", this.V);
        }
    }

    public final void p(int i10) {
        Status status = new Status(i10, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        W = false;
    }
}
