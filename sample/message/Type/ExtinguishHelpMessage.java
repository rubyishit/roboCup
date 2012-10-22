package sample.message.Type;

import java.util.ArrayList;
import java.util.List;

import rescuecore2.worldmodel.EntityID;
import sample.message.IntegerProperty;
import sample.message.MessageProperty;
import sample.message.PropertyName;

public class ExtinguishHelpMessage extends Message {

	public ExtinguishHelpMessage() {
		super();
	}

	public ExtinguishHelpMessage(EntityID buildingId) {
		this();
		setEntityId(PropertyName.BuildingId, buildingId);
	}

	@Override
	protected List<MessageProperty<?>> createProperties() {
		List<MessageProperty<?>> properties = new ArrayList<MessageProperty<?>>();
		properties.add(new IntegerProperty(PropertyName.BuildingId, 2));
		return properties;
	}

	@Override
	public MessageType getType() {
		return MessageType.ExtinguishHelpMessage;
	}

	public EntityID getBuildingId() {
		return getEntityId(PropertyName.BuildingId);
	}
}
