package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3507a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3508b;

    public /* synthetic */ b0(Object obj, Object obj2) {
        this.f3508b = obj;
        this.f3507a = obj2;
    }

    public void a(Status status, boolean z2) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f3507a)) {
            map = new HashMap((Map) this.f3507a);
        }
        synchronized (((Map) this.f3508b)) {
            map2 = new HashMap((Map) this.f3508b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z2 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z2 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.j(status));
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((b0) this.f3508b).f3508b).remove((TaskCompletionSource) this.f3507a);
    }

    public b0() {
        this.f3507a = Collections.synchronizedMap(new WeakHashMap());
        this.f3508b = Collections.synchronizedMap(new WeakHashMap());
    }
}
