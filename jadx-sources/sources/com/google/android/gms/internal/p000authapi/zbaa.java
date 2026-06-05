package com.google.android.gms.internal.p000authapi;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import gk.b;
import hd.q;
import java.util.List;
import nd.d;
import y3.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zbaa extends m {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;

    static {
        h hVar = new h();
        zba = hVar;
        zby zbyVar = new zby();
        zbb = zbyVar;
        zbc = new i("Auth.Api.Identity.Authorization.API", zbyVar, hVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zbaa(Activity activity, q qVar) {
        i iVar = zbc;
        String str = qVar.f7886a;
        if (str != null) {
            e0.e(str);
        }
        String strZba = zbat.zba();
        e0.e(strZba);
        super(activity, activity, iVar, new q(strZba), l.f3608c);
    }

    public final Task<hd.a> authorize(AuthorizationRequest authorizationRequest) {
        Bundle bundle;
        Object obj;
        String str;
        boolean z2;
        String str2;
        boolean z10;
        boolean z11;
        int i10;
        e0.i(authorizationRequest);
        List list = authorizationRequest.f3452a;
        e0.a("requestedScopes cannot be null or empty", (list == null || list.isEmpty()) ? false : true);
        Bundle bundle2 = authorizationRequest.B;
        String str3 = null;
        if (bundle2 != null) {
            Bundle bundle3 = null;
            for (String str4 : bundle2.keySet()) {
                String string = bundle2.getString(str4);
                int[] iArrC = e.c(2);
                int length = iArrC.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i10 = 0;
                        break;
                    }
                    i10 = iArrC[i11];
                    if (b.d(i10).equals(str4)) {
                        break;
                    }
                    i11++;
                }
                if (string != null && i10 != 0) {
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                    }
                    bundle3.putString(b.d(i10), string);
                }
            }
            bundle = bundle3;
        } else {
            bundle = null;
        }
        boolean z12 = authorizationRequest.A;
        String str5 = authorizationRequest.f3457f;
        Account account = authorizationRequest.f3456e;
        String str6 = authorizationRequest.f3453b;
        if (str5 != null) {
            e0.e(str5);
        } else {
            str5 = null;
        }
        if (account == null) {
            account = null;
        }
        if (!authorizationRequest.f3455d || str6 == null) {
            obj = str6;
            str = str5;
            z2 = false;
        } else {
            str3 = str6;
            obj = str3;
            str = str5;
            z2 = true;
        }
        if (!authorizationRequest.f3454c || obj == null) {
            str2 = str3;
            z10 = false;
            z11 = false;
        } else {
            e0.a("two different server client ids provided", str3 == null || str3.equals(obj));
            z10 = true;
            z11 = z12;
            str2 = obj;
        }
        final AuthorizationRequest authorizationRequest2 = new AuthorizationRequest(list, str2, z10, z2, account, str, ((q) getApiOptions()).f7886a, z11, bundle);
        x xVarA = y.a();
        xVarA.f3599e = new d[]{zbas.zbc};
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.auth-api.zbx
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj2, Object obj3) {
                zbz zbzVar = new zbz(this.zba, (TaskCompletionSource) obj3);
                zbk zbkVar = (zbk) ((zbg) obj2).getService();
                AuthorizationRequest authorizationRequest3 = authorizationRequest2;
                e0.i(authorizationRequest3);
                zbkVar.zbc(zbzVar, authorizationRequest3);
            }
        };
        xVarA.f3597c = false;
        xVarA.f3596b = 1534;
        return doRead(xVarA.a());
    }

    public final hd.a getAuthorizationResultFromIntent(Intent intent) throws j {
        Status status = Status.f3490z;
        if (intent == null) {
            throw new j(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : wd.a.v(byteArrayExtra, creator));
        if (status2 == null) {
            throw new j(Status.B);
        }
        if (!status2.b()) {
            throw new j(status2);
        }
        Parcelable.Creator<hd.a> creator2 = hd.a.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("authorization_result");
        hd.a aVar = (hd.a) (byteArrayExtra2 != null ? wd.a.v(byteArrayExtra2, creator2) : null);
        if (aVar != null) {
            return aVar;
        }
        throw new j(status);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zbaa(Context context, q qVar) {
        i iVar = zbc;
        String str = qVar.f7886a;
        if (str != null) {
            e0.e(str);
        }
        String strZba = zbat.zba();
        e0.e(strZba);
        super(context, null, iVar, new q(strZba), l.f3608c);
    }
}
