package ed;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.internal.auth.zzam;
import com.google.android.gms.internal.auth.zzbe;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.p000authapi.zbe;
import com.google.android.gms.internal.p001authapiphone.zzw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.common.api.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5922a;

    public /* synthetic */ g(int i10) {
        this.f5922a = i10;
    }

    @Override // com.google.android.gms.common.api.a
    public com.google.android.gms.common.api.g buildClient(Context context, Looper looper, i iVar, Object obj, n nVar, o oVar) {
        switch (this.f5922a) {
            case 0:
                return new zzam(context, looper, iVar, nVar, oVar);
            case 1:
                HashSet hashSet = new HashSet();
                new HashSet();
                q.e eVar = new q.e(0);
                q.e eVar2 = new q.e(0);
                Object obj2 = nd.e.f12277c;
                g gVar = ie.b.f8507a;
                new ArrayList();
                new ArrayList();
                context.getMainLooper();
                String packageName = context.getPackageName();
                String name = context.getClass().getName();
                com.google.android.gms.common.api.i iVar2 = ie.b.f8508b;
                return new zzaz(context, looper, nVar, oVar, "activity_recognition", new i(hashSet, eVar, packageName, name, eVar2.containsKey(iVar2) ? (ie.a) eVar2.get(iVar2) : ie.a.f8506a));
            case 2:
                return new zzaz(context, looper, nVar, oVar, "locationServices", iVar);
            case 3:
                return new zbe(context, looper, iVar, (fd.d) obj, nVar, oVar);
            case 4:
                return new ld.e(context, looper, iVar, (GoogleSignInOptions) obj, nVar, oVar);
            case 5:
            case 6:
            default:
                return super.buildClient(context, looper, iVar, obj, nVar, oVar);
            case 7:
                iVar.getClass();
                Integer num = iVar.f3646g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new je.a(context, looper, iVar, bundle, nVar, oVar);
            case 8:
                throw m1.f(obj);
        }
    }

    @Override // com.google.android.gms.common.api.f
    public List getImpliedScopes(Object obj) {
        switch (this.f5922a) {
            case 4:
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                return googleSignInOptions == null ? Collections.EMPTY_LIST : new ArrayList(googleSignInOptions.f3473b);
            default:
                return super.getImpliedScopes(obj);
        }
    }

    @Override // com.google.android.gms.common.api.a
    public /* synthetic */ com.google.android.gms.common.api.g buildClient(Context context, Looper looper, i iVar, Object obj, com.google.android.gms.common.api.internal.g gVar, q qVar) {
        switch (this.f5922a) {
            case 5:
                return new zzbe(context, looper, iVar, (fd.c) obj, gVar, qVar);
            case 6:
                return new zzw(context, looper, iVar, gVar, qVar);
            case 7:
            case 8:
            default:
                return super.buildClient(context, looper, iVar, obj, gVar, qVar);
            case 9:
                return new pd.c(context, looper, iVar, (v) obj, gVar, qVar);
        }
    }
}
