package t1;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import t4.j1;
import t4.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements t4.m, SuccessContinuation, Continuation, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15433b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f15432a = i10;
        this.f15433b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public void a() {
        ej.e eVar = (ej.e) this.f15433b;
        synchronized (m.f15471c) {
            ?? r2 = m.f15476h;
            fj.l.f(r2, "<this>");
            ArrayList arrayList = new ArrayList(qi.m.s0(r2));
            boolean z2 = false;
            for (Object obj : r2) {
                boolean z10 = true;
                if (!z2 && fj.l.b(obj, eVar)) {
                    z2 = true;
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(obj);
                }
            }
            m.f15476h = arrayList;
        }
    }

    @Override // t4.m
    public m1 i(View view, m1 m1Var) {
        w4.g gVar = (w4.g) this.f15433b;
        ArrayList arrayList = gVar.f18582b;
        j1 j1Var = m1Var.f15751a;
        l4.b bVarB = l4.b.b(j1Var.g(519), j1Var.g(64));
        l4.b bVarB2 = l4.b.b(j1Var.h(519), j1Var.h(64));
        if (!bVarB.equals(gVar.f18583c) || !bVarB2.equals(gVar.f18584d)) {
            gVar.f18583c = bVarB;
            gVar.f18584d = bVarB2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                w4.c cVar = (w4.c) arrayList.get(size);
                cVar.f18570c = bVarB;
                cVar.f18571d = bVarB2;
                cVar.c();
            }
        }
        return m1Var;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f15432a) {
            case 5:
                wh.a0.b((Intent) this.f15433b);
                break;
            case 6:
                ((wh.c0) this.f15433b).f19337b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.f15433b).cancel(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        ((uf.p) this.f15433b).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ArrayDeque arrayDeque;
        boolean z2;
        String str = (String) this.f15433b;
        wh.x xVar = (wh.x) obj;
        w8.h hVar = FirebaseMessaging.f4290m;
        xVar.getClass();
        wh.u uVar = new wh.u("S", str);
        wh.v vVar = xVar.f19407h;
        synchronized (vVar) {
            ak.v vVar2 = vVar.f19392a;
            String str2 = uVar.f19390c;
            vVar2.getClass();
            if (!TextUtils.isEmpty(str2) && !str2.contains((String) vVar2.f732c)) {
                synchronized (((ArrayDeque) vVar2.f733d)) {
                    if (((ArrayDeque) vVar2.f733d).add(str2)) {
                        ((ScheduledThreadPoolExecutor) vVar2.f734e).execute(new ac.o(vVar2, 26));
                    }
                }
            }
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (xVar.f19404e) {
            try {
                String str3 = uVar.f19390c;
                if (xVar.f19404e.containsKey(str3)) {
                    arrayDeque = (ArrayDeque) xVar.f19404e.get(str3);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    xVar.f19404e.put(str3, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Task task = taskCompletionSource.getTask();
        if (xVar.f19407h.a() != null) {
            synchronized (xVar) {
                z2 = xVar.f19406g;
            }
            if (!z2) {
                xVar.f(0L);
                return task;
            }
        }
        return task;
    }
}
