package ld;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.internal.p000authapi.zbat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends com.google.android.gms.common.internal.l {

    /* renamed from: a, reason: collision with root package name */
    public final GoogleSignInOptions f10917a;

    public e(Context context, Looper looper, com.google.android.gms.common.internal.i iVar, GoogleSignInOptions googleSignInOptions, n nVar, o oVar) {
        kd.b bVar;
        super(context, looper, 91, iVar, nVar, oVar);
        Set<Scope> set = iVar.f3641b;
        if (googleSignInOptions != null) {
            bVar = new kd.b();
            bVar.f9524a = new HashSet();
            bVar.f9531h = new HashMap();
            bVar.f9524a = new HashSet(googleSignInOptions.f3473b);
            bVar.f9525b = googleSignInOptions.f3476e;
            bVar.f9526c = googleSignInOptions.f3477f;
            bVar.f9527d = googleSignInOptions.f3475d;
            bVar.f9528e = googleSignInOptions.f3478z;
            bVar.f9529f = googleSignInOptions.f3474c;
            bVar.f9530g = googleSignInOptions.A;
            bVar.f9531h = GoogleSignInOptions.c(googleSignInOptions.B);
            bVar.f9532i = googleSignInOptions.C;
        } else {
            bVar = new kd.b();
            bVar.f9524a = new HashSet();
            bVar.f9531h = new HashMap();
        }
        bVar.f9532i = zbat.zba();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = bVar.f9524a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = bVar.f9524a;
        if (hashSet2.contains(GoogleSignInOptions.G)) {
            Scope scope2 = GoogleSignInOptions.F;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (bVar.f9527d && (bVar.f9529f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.E);
        }
        this.f10917a = new GoogleSignInOptions(3, new ArrayList(hashSet2), bVar.f9529f, bVar.f9527d, bVar.f9525b, bVar.f9526c, bVar.f9528e, bVar.f9530g, bVar.f9531h, bVar.f9532i);
    }

    @Override // com.google.android.gms.common.internal.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final Intent getSignInIntent() {
        Context context = getContext();
        h.f10921a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.f10917a);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean providesSignIn() {
        return true;
    }
}
