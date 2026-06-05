package je;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a extends l implements com.google.android.gms.common.api.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8855a;

    /* renamed from: b, reason: collision with root package name */
    public final i f8856b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f8857c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f8858d;

    public a(Context context, Looper looper, i iVar, Bundle bundle, n nVar, o oVar) {
        super(context, looper, 44, iVar, nVar, oVar);
        this.f8855a = true;
        this.f8856b = iVar;
        this.f8857c = bundle;
        this.f8858d = iVar.f3646g;
    }

    @Override // com.google.android.gms.common.internal.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.f
    public final Bundle getGetServiceRequestExtraArgs() {
        i iVar = this.f8856b;
        boolean zEquals = getContext().getPackageName().equals(iVar.f3643d);
        Bundle bundle = this.f8857c;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", iVar.f3643d);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        return this.f8855a;
    }
}
