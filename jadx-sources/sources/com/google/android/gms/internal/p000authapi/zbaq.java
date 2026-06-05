package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
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
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import hd.b;
import hd.c;
import hd.d;
import hd.e;
import hd.f;
import hd.g;
import hd.n;
import hd.o;
import hd.s;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zbaq extends m implements n {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;
    private final String zbd;

    static {
        h hVar = new h();
        zba = hVar;
        zbal zbalVar = new zbal();
        zbb = zbalVar;
        zbc = new i("Auth.Api.Identity.SignIn.API", zbalVar, hVar);
    }

    public zbaq(Activity activity, s sVar) {
        super(activity, activity, zbc, sVar, l.f3608c);
        this.zbd = zbat.zba();
    }

    @Override // hd.n
    public final Task<g> beginSignIn(f fVar) {
        e0.i(fVar);
        new b(false, null, null, true, null, null, false);
        b bVar = fVar.f7858b;
        e0.i(bVar);
        e eVar = fVar.f7857a;
        e0.i(eVar);
        d dVar = fVar.f7862f;
        e0.i(dVar);
        c cVar = fVar.f7863z;
        e0.i(cVar);
        final f fVar2 = new f(eVar, bVar, this.zbd, fVar.f7860d, fVar.f7861e, dVar, cVar, fVar.A);
        x xVarA = y.a();
        xVarA.f3599e = new nd.d[]{new nd.d("auth_api_credentials_begin_sign_in", 8L)};
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.auth-api.zbaj
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) {
                zbam zbamVar = new zbam(this.zba, (TaskCompletionSource) obj2);
                zbw zbwVar = (zbw) ((zbar) obj).getService();
                f fVar3 = fVar2;
                e0.i(fVar3);
                zbwVar.zbc(zbamVar, fVar3);
            }
        };
        xVarA.f3597c = false;
        xVarA.f3596b = 1553;
        return doRead(xVarA.a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) throws j {
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
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new j(status);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final hd.i iVar) {
        e0.i(iVar);
        x xVarA = y.a();
        xVarA.f3599e = new nd.d[]{zbas.zbh};
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.auth-api.zbah
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) {
                this.zba.zba(iVar, (zbar) obj, (TaskCompletionSource) obj2);
            }
        };
        xVarA.f3596b = 1653;
        return doRead(xVarA.a());
    }

    @Override // hd.n
    public final o getSignInCredentialFromIntent(Intent intent) throws j {
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
        Parcelable.Creator<o> creator2 = o.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        o oVar = (o) (byteArrayExtra2 != null ? wd.a.v(byteArrayExtra2, creator2) : null);
        if (oVar != null) {
            return oVar;
        }
        throw new j(status);
    }

    @Override // hd.n
    public final Task<PendingIntent> getSignInIntent(hd.j jVar) {
        e0.i(jVar);
        String str = jVar.f7866a;
        e0.i(str);
        String str2 = jVar.f7869d;
        final hd.j jVar2 = new hd.j(str, jVar.f7867b, this.zbd, str2, jVar.f7870e, jVar.f7871f);
        x xVarA = y.a();
        xVarA.f3599e = new nd.d[]{zbas.zbf};
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.auth-api.zbak
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) {
                zbao zbaoVar = new zbao(this.zba, (TaskCompletionSource) obj2);
                zbw zbwVar = (zbw) ((zbar) obj).getService();
                hd.j jVar3 = jVar2;
                e0.i(jVar3);
                zbwVar.zbe(zbaoVar, jVar3);
            }
        };
        xVarA.f3596b = 1555;
        return doRead(xVarA.a());
    }

    @Override // hd.n
    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = p.f3611a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((p) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        com.google.android.gms.common.api.internal.h.a();
        x xVarA = y.a();
        xVarA.f3599e = new nd.d[]{zbas.zbb};
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.auth-api.zbai
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) {
                this.zba.zbb((zbar) obj, (TaskCompletionSource) obj2);
            }
        };
        xVarA.f3597c = false;
        xVarA.f3596b = 1554;
        return doWrite(xVarA.a());
    }

    public final /* synthetic */ void zba(hd.i iVar, zbar zbarVar, TaskCompletionSource taskCompletionSource) {
        ((zbw) zbarVar.getService()).zbd(new zbap(this, taskCompletionSource), iVar, this.zbd);
    }

    public final /* synthetic */ void zbb(zbar zbarVar, TaskCompletionSource taskCompletionSource) {
        ((zbw) zbarVar.getService()).zbf(new zban(this, taskCompletionSource), this.zbd);
    }

    public zbaq(Context context, s sVar) {
        super(context, null, zbc, sVar, l.f3608c);
        this.zbd = zbat.zba();
    }
}
