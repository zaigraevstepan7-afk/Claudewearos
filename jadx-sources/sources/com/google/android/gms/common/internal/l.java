package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class l extends f implements com.google.android.gms.common.api.g {
    private static volatile Executor zaa;
    private final i zab;
    private final Set zac;
    private final Account zad;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(Context context, Looper looper, int i10, i iVar, com.google.android.gms.common.api.internal.g gVar, com.google.android.gms.common.api.internal.q qVar) {
        o0 o0VarA = m.a(context);
        nd.e eVar = nd.e.f12278d;
        e0.i(gVar);
        e0.i(qVar);
        super(context, looper, o0VarA, eVar, i10, new s(gVar), new s(qVar), iVar.f3644e);
        this.zab = iVar;
        this.zad = null;
        Set<Scope> set = iVar.f3641b;
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.zac = setValidateScopes;
    }

    @Override // com.google.android.gms.common.internal.f
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.f
    public Executor getBindServiceExecutor() {
        return null;
    }

    public final i getClientSettings() {
        return this.zab;
    }

    public nd.d[] getRequiredFeatures() {
        return new nd.d[0];
    }

    @Override // com.google.android.gms.common.internal.f
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.g
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.EMPTY_SET;
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
