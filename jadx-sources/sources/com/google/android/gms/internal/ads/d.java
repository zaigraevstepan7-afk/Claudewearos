package com.google.android.gms.internal.ads;

import android.media.AudioProfile;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ AudioProfile i(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ NetworkEvent.Builder k() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackMetrics.Builder o() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder p() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder s(int i10) {
        return new TrackChangeEvent.Builder(i10);
    }
}
