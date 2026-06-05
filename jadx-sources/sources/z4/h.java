package z4;

import a2.f0;
import android.content.Context;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import y.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final CredentialManager f20376a;

    public h(Context context) {
        fj.l.f(context, "context");
        this.f20376a = f.a(context.getSystemService("credential"));
    }

    @Override // z4.e
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.f20376a != null;
    }

    @Override // z4.e
    public final void onGetCredential(Context context, j jVar, CancellationSignal cancellationSignal, Executor executor, d dVar) {
        fj.l.f(context, "context");
        n nVar = (n) dVar;
        f0 f0Var = new f0(nVar, 19);
        CredentialManager credentialManager = this.f20376a;
        if (credentialManager == null) {
            f0Var.a();
            return;
        }
        g gVar = new g(nVar, this);
        t0.h.u();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builderE = t0.h.e(bundle);
        for (le.a aVar : jVar.f20377a) {
            t0.h.A();
            aVar.getClass();
            builderE.addCredentialOption(t0.h.d(aVar.f10926a, aVar.f10927b).setIsSystemProviderRequired(true).setAllowedProviders(aVar.f10928c).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builderE.build();
        fj.l.e(getCredentialRequestBuild, "builder.build()");
        credentialManager.getCredential(context, getCredentialRequestBuild, cancellationSignal, (n.a) executor, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>) gVar);
    }
}
