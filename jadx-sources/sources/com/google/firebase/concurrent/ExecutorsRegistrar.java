package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import gg.a;
import gg.c;
import gg.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kg.b;
import kg.f;
import kg.n;
import kg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final n f4272a = new n(new f(2));

    /* renamed from: b, reason: collision with root package name */
    public static final n f4273b = new n(new f(3));

    /* renamed from: c, reason: collision with root package name */
    public static final n f4274c = new n(new f(4));

    /* renamed from: d, reason: collision with root package name */
    public static final n f4275d = new n(new f(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r rVar = new r(a.class, ScheduledExecutorService.class);
        r[] rVarArr = {new r(a.class, ExecutorService.class), new r(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            yd.f.n(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new l7.n(1), hashSet3);
        r rVar3 = new r(gg.b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(gg.b.class, ExecutorService.class), new r(gg.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            yd.f.n(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new l7.n(2), hashSet6);
        r rVar5 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            yd.f.n(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new l7.n(3), hashSet9);
        kg.a aVarB = b.b(new r(d.class, Executor.class));
        aVarB.f9606f = new l7.n(4);
        return Arrays.asList(bVar, bVar2, bVar3, aVarB.b());
    }
}
